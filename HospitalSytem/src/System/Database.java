/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

//
import System.Adapters.ReadJSON;
import UserData.*;
import java.io.File;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//JSON for file reading.


/**
 *
 * @author Geri
 */
public class Database {    
    public static ArrayList<Administrator> admins;
    public static ArrayList<Doctor> doctors;
    public static ArrayList<Patient> patients;
    public static ArrayList<Secretary> secs;
    
    // Singleton
    private static Database instance = null;

    public static Database Start(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    public void Database(){
        
    }
    
    public void GenerateDatabase(){
        
        this.admins = Database.Load("admins.json", "A");
        this.doctors = this.Load("doctors.json", "D");
        this.patients = this.Load("patients.json", "P");
        this.secs = this.Load("secretaries.json", "S");
    }
    
    private static ArrayList Load(String fileName, String fileType){
        JSONArray data;
        
        data = ReadJSON.Import(new File("data" + File.separator + fileName));
        
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
        ArrayList<Administrator> adminList = new ArrayList<>();
        
        for (int i = 0; i < adminData.size(); i++) {
            JSONObject current = (JSONObject) adminData.get(i);
            UserData.Administrator tempAdmin = null;
           
            
            tempAdmin = new Administrator((String) current.get("ID"),
                    (String) current.get("givenName"),
                    (String) current.get("surname"),
                    (String) current.get("address"),
                    (String) current.get("password"));
            
            adminList.add(tempAdmin);
        }
        
        return adminList;
    }
    
    private static ArrayList CreateSecretary(JSONArray secData){
        ArrayList<Secretary> secList = new ArrayList<>();
        
        for (int i = 0; i < secData.size(); i++) {
            JSONObject current = (JSONObject) secData.get(i);
            UserData.Secretary tempSec = null;
            
            tempSec = new Secretary(current.get("ID").toString(),
                    current.get("givenName").toString(),
                    current.get("surname").toString(),
                    current.get("address").toString(),
                    current.get("password").toString());
            
            secList.add(tempSec);
        }
        
        return secList;
    }
    
    private static ArrayList CreateDoctor(JSONArray docData){
        ArrayList<Doctor> docList = new ArrayList<>();
        
        for (int i = 0; i < docData.size(); i++) {
            JSONObject current = (JSONObject) docData.get(i);
            UserData.Doctor tempDoc = null;
            
            tempDoc = new Doctor(current.get("ID").toString(),
                    current.get("givenName").toString(),
                    current.get("surname").toString(),
                    current.get("address").toString(),
                    current.get("password").toString());
            
            docList.add(tempDoc);
        }
        
        return docList;
    }
    
    private static ArrayList CreatePatient(JSONArray patientData){
        ArrayList<Patient> patientList = new ArrayList<>();
        
        for (int i = 0; i < patientData.size(); i++) {
            JSONObject current = (JSONObject) patientData.get(i);
            UserData.Patient tempPatient = null;
            tempPatient = new Patient(current.get("ID").toString(),
                    current.get("givenName").toString(),
                    current.get("surname").toString(),
                    current.get("address").toString(),
                    current.get("password").toString(), 
                    Integer.parseInt(current.get("age").toString()),
                    current.get("sex").toString());
            
            patientList.add(tempPatient);
        }
        
        return patientList;
    }
    
    
    
    private ArrayList CreateMedicines(){
     return null;   
    }
    
    public static User GetUser(String id){
        ArrayList<User> list = new ArrayList<User>();
        
        list.addAll(admins);
        list.addAll(doctors);
        list.addAll(secs);
        list.addAll(patients);

        for (User user : list) {
            
            if (user.getID().equalsIgnoreCase(id)) {
                return user;
            }
        } 
        return null;
    }
    
    public static ArrayList GetDoctors(){
        return doctors;
    }
    
    public ArrayList GetAdmins(){
        return admins;
    }
    
    public ArrayList GetPatients(){
        return patients;
    }
    
    public ArrayList GetSecs(){
        return secs;
    }
    
    public static void AddUserToDatabase(User user){
       if (user.getID().startsWith("A")) {
           admins.add((Administrator) user);
       }
       else if (user.getID().startsWith("D")) {
           doctors.add((Doctor) user);
       }
       else if (user.getID().startsWith("S")) {
           secs.add((Secretary) user);
       }
       else if (user.getID().startsWith("P")){
           patients.add((Patient) user);
       }
   }
   
    public static int GetNumberOfAdmins(){
        return admins.size();
    }
    
    public static int GetNumberOfDoctors(){
        return doctors.size();
    }
    
    public static int GetNumberOfPatients(){
        return patients.size();
    }
    
    public static int GetNumberOfSecretaries(){
        return secs.size();
    }
   
}
