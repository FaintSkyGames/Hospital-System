/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UserData.Secretary;
import UserInterface.SecretaryPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Geri
 */
public class SecretaryController {
    private SecretaryPage homeView;
    
    private Secretary currentUser;
    
    public void initaliseSecretaryView(Secretary secretary){
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
    }
    
    class NewAccountListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
        }
    }
    class RemoveRequestListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
             //*
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
             //*
        }
    }
    class ReOrderListener implements ActionListener{
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
