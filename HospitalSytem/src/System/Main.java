/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Database;
import UserData.*;
import Controllers.*;

/**
 *
 * @author Geri
 */
public class Main {
    public static AccessController accessController = new AccessController();
    public static DoctorController doctorController = new DoctorController();
    public static PatientController patientController = new PatientController();
    public static SecretaryController secretaryController = new SecretaryController();
    public static AdminController adminController = new AdminController();
    
    public static Database data = new Database();
    
    public static void main(String args[]) {
        data.GenerateDatabase();
        accessController.newView();
    }    
    
    
}
