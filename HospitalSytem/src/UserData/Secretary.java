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
    
    public Secretary(String firstName, String surname, String address, String password){
        super("S", firstName, surname, address, password);
    }
    
    public Secretary(String id, String firstName, String surname, String address, String password){
        super(id, firstName, surname, address, password);
    }
    
    public Secretary(User user){
        super(user.ID, user.firstName, user.surname, user.address, user.password);
    }
}
