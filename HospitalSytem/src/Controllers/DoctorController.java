/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.DoctorPage;
import UserData.Doctor;
import UserInterface.CreateAppointment;
import UserInterface.CreateMedicine;
import UserInterface.History;
import UserInterface.Notes;
import UserInterface.OrderRequest;
import UserInterface.Prescription;
import UserInterface.ViewAppointment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Geri
 */
public class DoctorController {
    private DoctorPage homeView;
    private ViewAppointment viewAppointmentView;
    private Notes notesView;
    private History historyView;
    private  CreateAppointment createAppointmentView;
    private Prescription prescriptionView;
    private CreateMedicine createMedicineView;
    private OrderRequest requestMedView;
    
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
        AddMainPageListeners();
    }
    public void AddMainPageListeners(){
        homeView.AddViewHistoryListener(new ViewAppointmentListener());
        homeView.AddNotesListener(new NotesListener());
        homeView.AddViewHistoryListener(new HistoryListener());
        homeView.AddCreateMedicineListener(new CreateMedicationListener());
        homeView.AddPrescription(new PrescriptionListener());
        homeView.AddCreateAppointmentListener(new CreateAppointmentListener());
        homeView.AddMedicationOrderListener(new RequestMedOrderListener());
        homeView.AddLogOutListener(new LogOutListener());
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
    
    
    public void initialiseViewAppointmentView(){
        viewAppointmentView = new ViewAppointment();
        homeView.dispose();
        viewAppointmentView.setVisible(true);
    }
    
    public void initialiseNoteView(){
        notesView = new Notes();
        homeView.dispose();
        notesView.setVisible(true);
    }
    
    public void initialiseHistoryView(){
        historyView = new History();
        homeView.dispose();
        historyView.setVisible(true);
    }
    public void initialiseCreateAppointmentView(){
        createAppointmentView = new CreateAppointment();
        homeView.dispose();
        createAppointmentView.setVisible(true);
    }
    public void initialisePrescribeView(){
        prescriptionView = new Prescription();
        homeView.dispose();
        prescriptionView.setVisible(true);
    }
    public void initialiseCreateMedView(){
        createMedicineView = new CreateMedicine();
        homeView.dispose();
        createMedicineView.setVisible(true);
    }
    public void initialiseRequestMedView(){
        requestMedView = new OrderRequest();
        homeView.dispose();
        requestMedView.setVisible(true);
    }
    
    private void initialiseLogInPage(){
        currentUser = null;
        homeView.dispose();
        AccessController accessController = new AccessController();
        accessController.newView();
    }
    
    class LogOutListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            initialiseLogInPage();
        }
    }
    
}
