/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Factories;

import UserData.*;
import System.Database;
import java.util.ArrayList;

/**
 *
 * @author Geri
 */
public class UserFactory {
    
    public User CreateUserOfType(String userType, String[] data){
        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("DOCTOR")) {
            return new Doctor(data, "D", Database.GetNumberOfDoctors());            
        }
        else if (userType.equalsIgnoreCase("PATIENT")) {
            return new Patient(data, "P", Database.GetNumberOfPatients());            
        }
        else if (userType.equalsIgnoreCase("SECRETARY")) {
            return new Secretary(data, "S", Database.GetNumberOfSecretaries());
        }
        else if (userType.equalsIgnoreCase("ADMINISTRATOR")) {
            return new Administrator(data, "A", Database.GetNumberOfAdmins());
        }
        
        return null;
    }
}
