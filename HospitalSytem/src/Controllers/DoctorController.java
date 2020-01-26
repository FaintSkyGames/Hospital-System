/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.DoctorPage;

/**
 *
 * @author Geri
 */
public class DoctorController {
    private DoctorPage view;
    public void newView(){
        view = new DoctorPage();
        view.setVisible(true);       
    }
    
}
