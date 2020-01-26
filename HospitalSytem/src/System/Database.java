/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

//
import System.Adapters.ReadJSON;
import UserData.*;

import java.util.ArrayList;

//JSON for file reading.
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Geri
 */
public class Database {
    
    public ArrayList<Administrator> admins;
    public ArrayList<Doctor> doctors;
    public ArrayList<Patient> patients;
    public ArrayList<Secretary> secs;
    
    public Database(){
        GenerateDatabase();
    }
    
    void GenerateDatabase(){
        
        this.admins = Database.Load("admins.json", "A");
        this.doctors = this.Load("doctors.json", "D");
        this.patients = this.Load("patients.json", "P");
        this.secs = this.Load("secretaries.json", "S");
    }
    
    private static ArrayList Load(String fileName, String fileType){
        JSONArray data;
        data = ReadJSON.Import(fileName);
        
        ArrayList arrayList = null; 
        
        if (fileType == "A") {
            arrayList = CreateAdmin(data);
        }
        else if (fileType == "D") {
            arrayList = CreateDoctor(data);
        }
        else if (fileType == "S") {
            arrayList = CreateSecretary(data);
        }
        else if (fileType == "P") {
            arrayList = CreatePatient(data);
        }
        else if (fileType == "Med") {
            
        }
        //* load file array
        //* if user create users from data
        
        return arrayList;
    }
    
    private static ArrayList CreateAdmin(JSONArray adminData){
        ArrayList<Administrator> adminList = null;
        
        for (int i = 0; i < adminData.size(); i++) {
            JSONObject current = (JSONObject) adminData.get(i);
            UserData.Administrator tempAdmin = null;
            
            tempAdmin = new Administrator(current.get("ID").toString(),
                    current.get("firstName").toString(),
                    current.get("surname").toString(),
                    current.get("address").toString(),
                    current.get("password").toString());
            
            adminList.add(tempAdmin);
        }
        
        return adminList;
    }
    
    private static ArrayList CreateSecretary(JSONArray secData){
        ArrayList<Secretary> secList = null;
        
        for (int i = 0; i < secData.size(); i++) {
            JSONObject current = (JSONObject) secData.get(i);
            UserData.Secretary tempSec = null;
            
            tempSec = new Secretary(current.get("ID").toString(),
                    current.get("firstName").toString(),
                    current.get("surname").toString(),
                    current.get("address").toString(),
                    current.get("password").toString());
            
            secList.add(tempSec);
        }
        
        return secList;
    }
    
    private static ArrayList CreateDoctor(JSONArray docData){
        ArrayList<Doctor> docList = null;
        
        for (int i = 0; i < docData.size(); i++) {
            JSONObject current = (JSONObject) docData.get(i);
            UserData.Doctor tempDoc = null;
            
            tempDoc = new Doctor(current.get("ID").toString(),
                    current.get("firstName").toString(),
                    current.get("surname").toString(),
                    current.get("address").toString(),
                    current.get("password").toString());
            
            docList.add(tempDoc);
        }
        
        return docList;
    }
    
    private static ArrayList CreatePatient(JSONArray patientData){
        ArrayList<Patient> patientList = null;
        
        for (int i = 0; i < patientData.size(); i++) {
            JSONObject current = (JSONObject) patientData.get(i);
            UserData.Patient tempPatient = null;
            
            tempPatient = new Patient(current.get("ID").toString(),
                    current.get("firstName").toString(),
                    current.get("surname").toString(),
                    current.get("address").toString(),
                    current.get("password").toString(), 
                    (int) current.get("age"),
                    current.get("gender").toString());
            
            patientList.add(tempPatient);
        }
        
        return patientList;
    }
    
    
    
    private ArrayList CreateMedicines(){
     return null;   
    }
    
    public User GetUser(String id){
        ArrayList list = null;
        
        if (id.startsWith("A")) {
            list = admins;
        }
        else if (id.startsWith("D")) {
            list = doctors;
        }
        else if (id.startsWith("S")){
            list = secs;
        }
        else if (id.startsWith("P")) {
            list = patients;
        }
        
        for (User user : admins) {
            if (user.getID().toUpperCase() == id.toUpperCase()) {
                return user;
            }
        } 
        return null;
    }

   
}