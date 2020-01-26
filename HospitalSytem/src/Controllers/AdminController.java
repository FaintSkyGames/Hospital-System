/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserInterface.ViewFeedback;
import UserInterface.AdministratorPage;
import System.Main;
import UserData.Administrator;
import UserData.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Geri
 */
public class AdminController {
    private AdministratorPage view;
    
    private Administrator currentUser;
    
    public void initialiseAdminView(Administrator admin){
        currentUser = admin;
        view = new AdministratorPage();
        view.setVisible(true);  

        
        String id = currentUser.getID();
        String firstName = currentUser.getFirstName();
        String surname = currentUser.getSurname();
        String address = currentUser.getAddress();
        
        view.SetDisplayedData(id, firstName + " " + surname, address);
        
        AddMainPageListeners();
        
    }
    
    
    public void AddMainPageListeners(){
        
        view.AddDoctorRatingListener(new DoctorRatingListener());
        view.AddFeedbackListener(new FeedbackListener());
        view.AddNewUserListener(new NewUserListener());
        view.AddRemoveUserListener(new RemoveUserListener());
    }
    
    class DoctorRatingListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
            ViewFeedback feedbackView = new ViewFeedback();
            feedbackView.setVisible(true); 
        }
    }
    
    class FeedbackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        //*
        }
    }
    
    class NewUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        //*
        }
    }
    
    class RemoveUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        //*
        }
    }
    
    

    
    
    
    
    
}
