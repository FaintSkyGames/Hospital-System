/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Factories;

import System.Database;

import UserData.User;
import java.util.ArrayList;

/**
 *
 * @author Geri
 */
public class CreateUser {
    
    public static void main(String type, String[] userData) {
        UserFactory userFactory = new UserFactory();
        
        User user = userFactory.CreateUserOfType(type, userData);   
        
        Database.AddUserToDatabase(user);
    }
}
