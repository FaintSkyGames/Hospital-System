/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserData;

/**
 *
 * @author Geri
 */
public class Doctor extends User {
    
    @Override
    public void test(){
        System.out.println("Doctor.test()");
    }
    
    public Doctor(){
        
    }
    
    public Doctor(String firstName, String surname, String address, String password){
        super("D", firstName, surname, address, password);
    }
    
    public Doctor(String id, String firstName, String surname, String address, String password){
        super(id, firstName, surname, address, password);
    }

    public Doctor(String[] user, String userType, int numberOfType){
        super(user, userType, numberOfType);
    }
}
