/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.PatientPage;
import UserData.Patient;

/**
 *
 * @author Geri
 */
public class PatientController {
    private PatientPage view;
    
    private Patient currentUser;
    
    public void initialisePatientView(Patient patient){
        currentUser = patient;
        view = new PatientPage();
        view.setVisible(true); 
        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        String age = Integer.toString(currentUser.getAge());
        String gender = currentUser.getGender();
        
        view.SetDisplayedData(id, firstName + " " + surname, age, gender, address);
    }
    
    
}
