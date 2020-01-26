/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.AdministratorPage;

/**
 *
 * @author Geri
 */
public class AdminController {
    private AdministratorPage view;
    public void newView(){
        view = new AdministratorPage();
        view.setVisible(true);       
    }
    
    
    
}
