/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Adapters;

//file reader
import java.io.*;
import java.text.ParseException;
import java.util.Iterator;

// JSON for file reading
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

/**
 *
 * @author Geri
 */
public  class ReadJSON {

    public static JSONArray Import(String file){
        JSONParser parser = new JSONParser();
        JSONArray fileData = null;
        
        try
        {
            JSONObject obj = (JSONObject) parser.parse(new FileReader(file));
            
            fileData = (JSONArray) obj.get(null);
            //* find & get file
            //* put into array
            
        }
        catch(Exception e)
        {
            
        }
        
        return fileData;
        
    }
    
    
    
}
