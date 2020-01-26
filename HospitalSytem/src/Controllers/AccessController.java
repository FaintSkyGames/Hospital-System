/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.LogInPage;
import System.Database;
import System.Main;
import UserData.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Geri
 */

// Controlls who has access to what
public class AccessController {
    
    private LogInPage view;
    
    
    public void TryLogIn(String userID, String password){
        User checkUser = null;
        
        // Check data's been entered
        if (userID == null | password == null) {
            //* show error *//
            return;
        }

       checkUser = Database.GetUser(userID);
       
       // Check user exsists
        if (checkUser == null) {
            //* show error *//
            return;
        }
           
        // Check passwords match
        if (checkUser.getPassword() != password) {
            //* show error *//
            return;
        }
        
        Main.setCurrentUser(user);
        
        //* show notifications *//
        //* direct to correct page *//
        
    }
    
    @overrides
    class LogInPage implements ActionListener{
        
        public void actionPerformed(ActionEvent arg0){
            
            TryLogIn();
        }
    }
    
}
