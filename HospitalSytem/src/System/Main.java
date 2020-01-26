/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Database;
import UserData.*;

/**
 *
 * @author Geri
 */
public class Main {
    
    private static User currentUser = null;
    
    public void Main(){
        Database.Start();
    }  

    public static User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    
    
}
