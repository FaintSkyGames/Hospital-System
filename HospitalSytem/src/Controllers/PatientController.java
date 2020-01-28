/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import System.Database;
import UserData.Doctor;
import UserInterface.PatientPage;
import UserData.Patient;
import UserInterface.AppointmentRequest;
import UserInterface.History;
import UserInterface.LeaveFeedback;
import UserInterface.Prescription;
import UserInterface.TerminationRequest;
import UserInterface.ViewFeedback;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Geri
 */
public class PatientController {
    private PatientPage homeView;
    private LeaveFeedback rateDoctorView;
    private ViewFeedback feedbackView;
    private AppointmentRequest appointmentRequestView;
    private History historyView;
    private Prescription prescriptionView;
    private TerminationRequest terminationRequestView;
    
    
    private Patient currentUser;
    
    public void initialisePatientView(Patient patient){
        currentUser = patient;
        homeView = new PatientPage();
        homeView.setVisible(true); 
        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        String age = Integer.toString(currentUser.getAge());
        String gender = currentUser.getGender();
        
        homeView.SetDisplayedData(id, firstName + " " + surname, age, gender, address);  
        
        AddMainPageListeners();
    }   
    
    public void AddMainPageListeners(){
        
        homeView.AddDoctorRatingListener(new DoctorRatingListener());
        homeView.AddLeaveFeedbackListener(new LeaveFeedbackListener());
        homeView.AddRequestAppointmentListener(new RequestAppointmentListener());
        homeView.AddViewHistoryListener(new HistoryListener());
        homeView.AddPrescription(new PrescriptionListener());
        homeView.AddTerminationRequestListener(new RequestTerminationListener());
        homeView.AddLogOutListener(new LogOutListener());
    }
    
    class LeaveFeedbackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    
    class DoctorRatingListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseFeedbackView();
        }
    }
    
    class RequestAppointmentListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseRequestAppointmentView();
        }
    }
    
    class HistoryListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseHistoryView();
        }
    }
    
    class PrescriptionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialisePrescriptionView();
        }
    }
    
    class RequestTerminationListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseTerminationRequestView();
        }
    }
    
    
    public void initialiseRateDoctorView(){
        rateDoctorView = new LeaveFeedback();
        homeView.dispose();
        rateDoctorView.setVisible(true);
    }
    
    
    
    
    private void initialiseFeedbackView(){
        feedbackView = new ViewFeedback();
        homeView.dispose();
        feedbackView.setVisible(true);
        
        ArrayList<UserData.Doctor> doctors = Database.GetDoctors();        
        Object[] doctorIDs = new Object[doctors.size()];
        for (int i = 0; i < doctors.size(); i++) {
            doctorIDs[i] = doctors.get(i).getID();
        }        
        feedbackView.SetDoctors(doctorIDs);
        
        setDoctorFeedbackInformation();
        
        //* set feedback

        AddFeedbackListeners();
        
        System.out.println("Patient");
    }
    
    
    
    public void setDoctorFeedbackInformation(){
        Doctor currentDoctor = (Doctor) Database.GetUser(feedbackView.GetCurrentDoctor());
        
        feedbackView.SetDoctorName(currentDoctor.getFirstName() + " " + currentDoctor.getSurname());
        feedbackView.SetAddress(currentDoctor.getAddress());
        
    }
    
    private void AddFeedbackListeners(){
        feedbackView.AddAdminReturnListener(new AdminReturnFromFeedbackListener());
        feedbackView.AddDocotorChangeListener(new FeedbackDoctorChangeListener());
    }
    
    class AdminReturnFromFeedbackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            feedbackView.dispose();
            initialisePatientView(currentUser);
        }
    }
    
    class FeedbackDoctorChangeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            setDoctorFeedbackInformation();
        }
    }
    
    public void initialiseRequestAppointmentView(){
        appointmentRequestView = new AppointmentRequest();
        homeView.dispose();
        appointmentRequestView.setVisible(true);
    }
    
    public void initialiseHistoryView(){
        historyView = new History();
        homeView.dispose();
        historyView.setVisible(true);
    }
    public void initialisePrescriptionView(){
        prescriptionView = new Prescription();
        homeView.dispose();
        prescriptionView.setVisible(true);
    }
    public void initialiseTerminationRequestView(){
        terminationRequestView = new TerminationRequest();
        homeView.dispose();
        terminationRequestView.setVisible(true);
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
