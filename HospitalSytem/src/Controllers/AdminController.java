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
import System.Factories.CreateUser;
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
    private static CreateAccount createAccount;
    
    private Administrator currentUser;
    
    // Listeners and code for admin menu
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
            initialiseCreateUserView();
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
    
    
    // Listeners and code for showing feedback
    // Also allows for admin to submit feedback summaries
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
        
        System.out.println("Admin");
    }
    
    public void setDoctorFeedbackInformation(){
        Doctor currentDoctor = (Doctor) Database.GetUser(feedbackView.GetCurrentDoctor());
        
        feedbackView.SetDoctorName(currentDoctor.getFirstName() + " " + currentDoctor.getSurname());
        feedbackView.SetAddress(currentDoctor.getAddress());
        
    }
    
    private void AddFeedbackListeners(){
        feedbackView.AddAdminReturnListener(new AdminReturnFromFeedbackListener());
        feedbackView.AddDocotorChangeListener(new FeedbackDoctorChangeListener());
        feedbackView.AddSubmitFeedbackSummaryListener(new SubmitSummaryListener());
    }
    
    class AdminReturnFromFeedbackListener implements ActionListener{
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
    
    class SubmitSummaryListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //*
        }
    }
    
    //
    private void initialiseCreateUserView(){
        createAccount = new CreateAccount();
        homeView.dispose();
        createAccount.setVisible(true);
        
        AddCreateUserListeners();
    }
    
    private static void CreateUser(){
        String[] userData = new String[7];
        
                
        CreateUser.main(createAccount.GetUserType(), userData);
        
    }
    
    private void AddCreateUserListeners(){
        createAccount.AddAdminReturnListener(new AdminReturnFromCreateUserListener());
        createAccount.AddSubmitNewUserListener(new SubmitNewUserListener());
    }
    
    class AdminReturnFromCreateUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            createAccount.dispose();
            initialiseAdminView(currentUser);
        }
    }
    
    class SubmitNewUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            CreateUser();
            //* make new user
            //* say user made
            createAccount.dispose();
            initialiseAdminView(currentUser);
        }
    }
    
    
    
    

    
    
    
    
    
}
