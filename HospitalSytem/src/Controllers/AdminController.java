/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import System.Adapters.WriteJSON;
import UserInterface.ViewFeedback;
import UserInterface.CreateAccount;
import UserInterface.RemoveUsers;
import UserInterface.AdministratorPage;
import System.Main;
import System.Database;
import System.Factories.CreateUser;
import UserData.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geri
 */
public class AdminController {
    private AdministratorPage homeView;
    private ViewFeedback feedbackView;
    private static CreateAccount createAccount;
    private RemoveUsers removeUsers;
    
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
            initialiseRemoveUserView();
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
    
    
    //Listeners and code for making a new user
    private void initialiseCreateUserView(){
        createAccount = new CreateAccount();
        homeView.dispose();
        createAccount.setVisible(true);
        
        AddCreateUserListeners();
    }
    
    private static void CreateUser(){
        String[] userData = new String[7];
        userData[0] = createAccount.GetFirstName();
        userData[1] = createAccount.GetSurname();
        userData[2] = createAccount.GetAddress();
        userData[3] = createAccount.GetPassword();                
                
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
    
    
    //
    private void initialiseRemoveUserView(){
        removeUsers = new RemoveUsers();
        homeView.dispose();
        removeUsers.setVisible(true);
        
        removeUsers.CreateColumns();
        UpdateTable();
        
        AddRemoveUserListeners();
    }
    
    private void UpdateTable(){

        for (Administrator admin : Database.admins) {
            if (admin != currentUser) {
                removeUsers.Populate(admin.getID(), 
                        admin.getFirstName() + " " + admin.getSurname(), 
                        "Admin");
            }
        }
        
        for (Doctor doctor : Database.doctors) {
            removeUsers.Populate(doctor.getID(), 
                    doctor.getFirstName() + " " + doctor.getSurname(), 
                    "Doctor");
        }
        
        for (Secretary sec : Database.secs) {
            removeUsers.Populate(sec.getID(),
                    sec.getFirstName() + " " + sec.getSurname(),
                    "Secretary");
        }
        
        for (Patient patient : Database.patients) {
            removeUsers.Populate(patient.getID(), 
                    patient.getFirstName() + " " + patient.getSurname(), 
                    "Patient");
        }        
    }
    
    private void ShowUserData(){
        User user = Database.GetUser(removeUsers.GetSelectedID());
        
        removeUsers.SetTxtName(user.getFirstName() + " " + user.getSurname());
        removeUsers.SetTxtID(user.getID());
        removeUsers.SetTxtAddress(user.getAddress());
    }
    
    private void RemoveSelectedUser(){
        Database.RemoveUserFromDatabase(removeUsers.GetSelectedID());
        removeUsers.dispose();
        //WriteJSON.Export();
        initialiseAdminView(currentUser);
        
    }
    
    private void AddRemoveUserListeners(){
        removeUsers.AddAdminReturnListener(new AdminReturnFromRemoveUserListener());
        removeUsers.AddDeleteUserListener(new DeleteUserListener());
        removeUsers.AddShowUserDataListener(new ShowUserListener());
    }
    
    class AdminReturnFromRemoveUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            removeUsers.dispose();
            initialiseAdminView(currentUser);
        }
    }
    
    class DeleteUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            RemoveSelectedUser();
        }
    }
    
    class ShowUserListener implements ListSelectionListener{
        @Override
        public void valueChanged(ListSelectionEvent e){
            ShowUserData();
        }
    }
    

    
    
    
    
    
}
