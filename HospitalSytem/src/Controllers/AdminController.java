/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.ViewFeedback;
import UserInterface.CreateAccount;
import UserInterface.RemoveUsers;
import UserInterface.AdministratorPage;
import System.Main;
import System.Database;
import UserData.Administrator;
import UserData.Doctor;
import UserData.User;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Geri
 */
public class AdminController {
    private AdministratorPage homeView;
    private ViewFeedback feedbackView;
    
    private Administrator currentUser;
    
    public void initialiseAdminView(Administrator admin){
        currentUser = admin;
        homeView = new AdministratorPage();
        homeView.setVisible(true);  

        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        
        homeView.SetDisplayedData(id, firstName + " " + surname, address);
        
        AddMainPageListeners();
        
    }
    
    public void AddMainPageListeners(){
        
        homeView.AddDoctorRatingListener(new DoctorRatingListener());
        homeView.AddNewUserListener(new NewUserListener());
        homeView.AddRemoveUserListener(new RemoveUserListener());
    }
    
    class DoctorRatingListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseFeedbackView();
        }
    }
    
    class NewUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            CreateAccount createAccountView = new CreateAccount();
            homeView.dispose();
            createAccountView.setVisible(true);
        }
    }
    
    class RemoveUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            RemoveUsers removeUserView = new RemoveUsers();
            homeView.dispose();
            removeUserView.setVisible(true);
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
    }
    
    public void setDoctorFeedbackInformation(){
        Doctor currentDoctor = (Doctor) Database.GetUser(feedbackView.GetCurrentDoctor());
        
        feedbackView.SetDoctorName(currentDoctor.getFirstName() + " " + currentDoctor.getSurname());
        feedbackView.SetAddress(currentDoctor.getAddress());
        
    }
    
    private void AddFeedbackListeners(){
        feedbackView.AddAdminReturnListener(new AdminReturnListener());
        feedbackView.AddDocotorChangeListener(new FeedbackDoctorChangeListener());
    }
    
    class AdminReturnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            feedbackView.dispose();
            initialiseAdminView(currentUser);
        }
    }
    
    class FeedbackDoctorChangeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            setDoctorFeedbackInformation();
        }
    }
    
    

    
    
    
    
    
}
