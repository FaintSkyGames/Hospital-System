/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.DoctorPage;
import UserData.Doctor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Geri
 */
public class DoctorController {
    private DoctorPage homeView;
    
    private Doctor currentUser;
    
    public void initialiseDoctorView(Doctor doctor){
        currentUser = doctor;
        homeView = new DoctorPage();
        homeView.setVisible(true); 
        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        
        homeView.SetDisplayedData(id, firstName + " " + surname, address);
    }
    public void AddMainPageListeners(){
        homeView.AddViewHistoryListener(new ViewAppointmentListener());
        homeView.AddNotesListener(new NotesListener());
        homeView.AddViewHistoryListener(new HistoryListener());
        homeView.AddCreateMedicineListener(new CreateMedicationListener());
        homeView.AddPrescription(new PrescriptionListener());
        homeView.AddCreateAppointmentListener(new CreateAppointmentListener());
        homeView.AddMedicationOrderListener(new RequestMedOrderListener());
    }
    
    class ViewAppointmentListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class NotesListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class HistoryListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class CreateAppointmentListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class PrescriptionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class CreateMedicationListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class RequestMedOrderListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    
    
}
