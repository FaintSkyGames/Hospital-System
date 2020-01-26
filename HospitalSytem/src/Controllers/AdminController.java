/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.AdministratorPage;
import System.Main;
import UserData.Administrator;
import UserData.User;

/**
 *
 * @author Geri
 */
public class AdminController {
    private AdministratorPage view;
    
    private Administrator currentUser;
    
    public void initialiseAdminView(Administrator admin){
        currentUser = admin;
        view = new AdministratorPage();
        view.setVisible(true);  

        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        
        view.SetDisplayedData(id, firstName + " " + surname, address);
        
    }

    
    
    
    
    
}
