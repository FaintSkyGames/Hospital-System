/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.PatientPage;

/**
 *
 * @author Geri
 */
public class PatientController {
    private PatientPage view;
    public void newView(){
        view = new PatientPage();
        view.setVisible(true);       
    }
}
