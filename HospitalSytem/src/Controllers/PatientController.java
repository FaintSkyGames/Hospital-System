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
    private ViewFeedback feedbackView;
    
    
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
             //*
        }
    }
    
    class HistoryListener implements ActionListener{
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
    
    class RequestTerminationListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
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
    
}
