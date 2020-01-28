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
    
    private void AddListeners(){
        view.AddSubmitListener(new LoginListener());
    }
    
    public void newView(){
        view = new LogInPage();
        view.setVisible(true);
        AddListeners();
    }
    
    public void TryLogIn(String userID, String password){
        User checkUser = null;
        // Check data's been entered
        if (userID == null | password == null) {
            //* show error *//
            view.ClearPassword();
            view.ClearUserID();
            return;
        }

       checkUser = Database.GetUser(userID);
       
       
        
       // Check user exsists
        if (checkUser == null) {
            //* show error *//
            view.ClearPassword();
            view.ClearUserID();
            return;
        }
           
        // Check passwords match
        if (!checkUser.getPassword().equalsIgnoreCase(password)) {
            //* show error *//
            view.ClearPassword();
            view.ClearUserID();
            return;
        }
        
        //* show notifications *//
        //* direct to correct page *//
        if (checkUser.getID().startsWith("A")) {
            view.dispose();
            Main.adminController.initialiseAdminView((Administrator) checkUser);
        }
        else if (checkUser.getID().startsWith("D")) {
            view.dispose();
            Main.doctorController.initialiseDoctorView((Doctor) checkUser);
        }
        else if (checkUser.getID().startsWith("S")) {
            view.dispose();
            Main.secretaryController.initialiseSecretaryView((Secretary) checkUser);
        }
        else{
            view.dispose();
            Main.patientController.initialisePatientView((Patient) checkUser);
        
        }
        
    }
    

    class LoginListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent arg0){
            String userID = view.getID();
            String passString = view.getPassword();
            TryLogIn(userID, passString);
        }
    }
    
}
