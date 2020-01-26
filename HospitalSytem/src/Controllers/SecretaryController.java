/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserData.Secretary;
import UserInterface.SecretaryPage;
/**
 *
 * @author Geri
 */
public class SecretaryController {
    private SecretaryPage view;
    
    private Secretary currentUser;
    
    public void initaliseSecretaryView(Secretary secretary){
        currentUser = secretary;
        view = new SecretaryPage();
        view.setVisible(true);       
        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        
        view.SetDisplayedData(id, firstName + " " + surname, address);
    }    
    
}
