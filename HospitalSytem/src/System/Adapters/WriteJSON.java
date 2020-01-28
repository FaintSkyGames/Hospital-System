/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Adapters;

import UserData.*;
import System.Database;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Geri
 */
public class WriteJSON {
    
    public static void Export() {
        
        JSONArray patients;
        patients = ConvertPatientArrayToJSON(Database.GetPatients());
        
        try(FileWriter file = new FileWriter("admins.json")){
            file.write(ConvertUserArrayToJSON(Database.GetAdmins()).toJSONString());
        }
        catch(IOException e){
            
        }
        try(FileWriter file = new FileWriter("doctors.json")){
            file.write(ConvertUserArrayToJSON(Database.GetDoctors()).toJSONString());
        }
        catch(IOException e){
            
        }
        try(FileWriter file = new FileWriter("secretaries.json")){
            file.write(ConvertUserArrayToJSON(Database.GetSecs()).toJSONString());
        }
        catch(IOException e){
            
        }
        try(FileWriter file = new FileWriter("patients.json")){
            file.write(patients.toJSONString());
        }
        catch(IOException e){
            System.out.println("System.Adapters.WriteJSON.Export()");
        }
        
        
        
    }
    
    private static JSONArray ConvertUserArrayToJSON(ArrayList<User> userList) {        
        JSONArray list = new JSONArray();
        
        for (User user : userList) {
            JSONObject userObject = new JSONObject();
            userObject.put("ID", user.getID());
            userObject.put("givennane", user.getFirstName());
            userObject.put("surname", user.getSurname());
            userObject.put("address", user.getAddress());
            userObject.put("password", user.getPassword());
            
            list.add(userObject);
        }
        
        return list;        
    }
    
    private static JSONArray ConvertPatientArrayToJSON(ArrayList<Patient> patientList){
        JSONArray list = new JSONArray();
        
        for (Patient user : patientList) {
            JSONObject userObject = new JSONObject();
            userObject.put("ID", user.getID());
            userObject.put("givennane", user.getFirstName());
            userObject.put("surname", user.getSurname());
            userObject.put("address", user.getAddress());
            userObject.put("password", user.getPassword());
            userObject.put("age", user.getAge());
            userObject.put("gender", user.getGender());
            
            list.add(userObject);
        }
        
        return list;        
    }
    
}
