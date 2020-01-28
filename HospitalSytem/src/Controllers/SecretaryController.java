/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import System.Database;
import System.Factories.CreateUser;
import UserData.Administrator;
import UserData.Doctor;
import UserData.Patient;
import UserData.Secretary;
import UserData.User;
import UserInterface.ApprovePatientAccounts;
import UserInterface.CreateMedicine;
import UserInterface.GiveMedicine;
import UserInterface.OrderConfirmation;
import UserInterface.RemoveUsers;
import UserInterface.SecretaryPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author Geri
 */
public class SecretaryController {
    private SecretaryPage homeView;
    private static ApprovePatientAccounts approveAccountsView;
    private GiveMedicine giveMedView;
    private OrderConfirmation orderMedView;
    private RemoveUsers removeUserView;
    
    private Secretary currentUser;
    
    public void initialiseSecretaryView(Secretary secretary){
        currentUser = secretary;
        homeView = new SecretaryPage();
        homeView.setVisible(true);       
        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        
        homeView.SetDisplayedData(id, firstName + " " + surname, address);
        
        AddMainPageListeners();
    }    
    
    public void AddMainPageListeners(){        
        homeView.AddNewAccountApproveListener(new NewAccountListener());
        homeView.AddRemoveApproveListener(new RemoveRequestListener());
        homeView.AddAppointmentRequestListener(new AppointmentRequestListener());
        homeView.AddGiveMedListener(new GiveMedListener());
        homeView.AddOrderMedStockListener(new ReOrderListener());
        homeView.AddRemovePatientsListener(new RemoveUserListener());
        homeView.AddLogOutListener(new LogOutListener());
    }
    
    class NewAccountListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseUserRequestView();
        }
    }
    class RemoveRequestListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseUserRequestView();
        }
    }
    class AppointmentRequestListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class GiveMedListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseGiveMedView();
        }
    }
    class ReOrderListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseOrderMedView();
        }
    }
    class RemoveUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             initialiseRemoveUserView();
        }
    }
    
    
    public void initialiseUserRequestView(){
        approveAccountsView = new ApprovePatientAccounts();
        homeView.dispose();
        approveAccountsView.setVisible(true);
        
        approveAccountsView.CreateColumns();
        UpdateTableRequests();
        
        AddUserRequestListeners();
    }

    public void AddUserRequestListeners(){
        System.out.println("Controllers.SecretaryController.AddUserRequestListeners()");
        approveAccountsView.AddReturnListener(new ReturnFromUserRequestsListener());
        approveAccountsView.AddApproveUserListener(new ApproveRequestListener());
        approveAccountsView.AddDeclineUserListener(new RemoveRequestListener());
        approveAccountsView.AddShowUserDataListener(new ShowRequestUserListener());
        
    }
    
    private void UpdateTableRequests(){
        for (Patient patient : Database.terminationRequests) {
            approveAccountsView.Populate(patient.getFirstName() + " " + patient.getSurname(), 
                    "Terminate");
        }
        for (Patient patient : Database.newAccountRequests) {
            approveAccountsView.Populate(patient.getFirstName() + " " + patient.getSurname(), 
                    "New Account");
        }            
    }
    
    private void ShowRequestUserData(){
        Patient user = (Patient) Database.GetUser(approveAccountsView.GetSelectedID());
        
        approveAccountsView.SetTxtName(user.getFirstName() + " " + user.getSurname());
        approveAccountsView.SetTxtID(user.getID());
        approveAccountsView.SetTxtAge(Integer.toString(user.getAge()));
        approveAccountsView.SetTxtGender(user.getGender());
        approveAccountsView.SetTxtAddress(user.getAddress());
    }
    
    private void CompleteRequest(){
        if(approveAccountsView.GetSelectedType() == "Terminate"){
            RemoveSelectedRequestingUser();
        }
        else{
            CreateUser();
            Database.AddUserToDatabase(Database.GetUser("", "", ""));
        }    
    }
    
    private void RemoveSelectedRequestingUser(){
        Database.RemoveUserFromDatabase(approveAccountsView.GetSelectedID());
        approveAccountsView.dispose();
        //WriteJSON.Export();
        initialiseSecretaryView(currentUser);
        
    }    
    private static void CreateUser(){
        String[] userData = new String[7];
        userData[0] = approveAccountsView.GetFirstName();
        userData[1] = approveAccountsView.GetSurname();
        userData[2] = approveAccountsView.GetAddress();
        userData[3] = approveAccountsView.GetPassword();
        userData[4] = approveAccountsView.GetAge();
        userData[4] = approveAccountsView.GetGender();
                
        CreateUser.main("PATIENT", userData);       
    }
    
    private void RemoveSelectRequestFromDatabase(){
        Database.RemoveRequestFromDatabase(approveAccountsView.GetSelectedID(), approveAccountsView.GetSelectedType());
        approveAccountsView.dispose();
        //WriteJSON.Export();
        initialiseSecretaryView(currentUser);
    }
    
    class ReturnFromUserRequestsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            approveAccountsView.dispose();
            initialiseSecretaryView(currentUser);
        }
    }
    
    class ApproveRequestListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            RemoveSelectedRequestingUser();
        }
    }
    
    class RemoveFromDatabaseListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            RemoveSelectRequestFromDatabase();
        }
    }
    
    class ShowRequestUserListener implements ListSelectionListener{
        @Override
        public void valueChanged(ListSelectionEvent e){
            ShowUserData();
        }
    }
    
    
    
    
    
    public void initialiseGiveMedView(){
        giveMedView = new GiveMedicine();
        homeView.dispose();
        giveMedView.setVisible(true);
    }
    public void initialiseOrderMedView(){
        orderMedView = new OrderConfirmation();
        homeView.dispose();
        orderMedView.setVisible(true);
    }
    
    
    
    
    public void initialiseRemoveUserView(){
        removeUserView = new RemoveUsers();
        homeView.dispose();
        removeUserView.setVisible(true);
        
        removeUserView.CreateColumns();
        UpdateTableRemoveUsers();
        
        AddRemoveUserListeners();
    }
    
    private void UpdateTableRemoveUsers(){
        for (Patient patient : Database.patients) {
            removeUserView.Populate(patient.getID(), 
                    patient.getFirstName() + " " + patient.getSurname(), 
                    "Patient");
        }        
    }
    
    private void ShowUserData(){
        User user = Database.GetUser(removeUserView.GetSelectedID());
        
        removeUserView.SetTxtName(user.getFirstName() + " " + user.getSurname());
        removeUserView.SetTxtID(user.getID());
        removeUserView.SetTxtAddress(user.getAddress());
    }
    
    private void RemoveSelectedUser(){
        Database.RemoveUserFromDatabase(removeUserView.GetSelectedID());
        removeUserView.dispose();
        //WriteJSON.Export();
        initialiseSecretaryView(currentUser);
        
    }
    
    private void AddRemoveUserListeners(){
        removeUserView.AddReturnListener(new ReturnFromRemoveUserListener());
        removeUserView.AddDeleteUserListener(new DeleteUserListener());
        removeUserView.AddShowUserDataListener(new ShowUserListener());
    }
    
    class ReturnFromRemoveUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            removeUserView.dispose();
            initialiseSecretaryView(currentUser);
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
