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
public class Administrator extends User {
    
    public Administrator(String firstName, String surname, String address, String password){
        super("A", firstName, surname, address, password);
    }
    public Administrator(String id, String firstName, String surname, String address, String password){
        super(id, firstName, surname, address, password);
    }
    
    //* if you pass in an object *//
    //* public Administator(object){
    //*    super(object);   
    //* }

    public Administrator(User user) {
        super(user.ID, user.firstName, user.surname, user.address, user.password);
    }
    
    
}
