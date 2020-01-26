/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.DoctorPage;
import UserData.Doctor;

/**
 *
 * @author Geri
 */
public class DoctorController {
    private DoctorPage view;
    
    private Doctor currentUser;
    
    public void initialiseDoctorView(Doctor doctor){
        currentUser = doctor;
        view = new DoctorPage();
        view.setVisible(true); 
        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        
        view.SetDisplayedData(id, firstName + " " + surname, address);
    }
    
}
