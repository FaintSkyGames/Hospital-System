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
public class Secretary extends User {
    
    @Override
    public void test(){
        System.out.println("Sec.test()");
    }
    
    public Secretary(){
        
    }
    
    public Secretary(String firstName, String surname, String address, String password){
        super("S", firstName, surname, address, password);
    }
    
    public Secretary(String id, String firstName, String surname, String address, String password){
        super(id, firstName, surname, address, password);
    }
    
    public Secretary(String[] user, String userType, int numberOfType){
        super(user, userType, numberOfType);
    }
    
}
