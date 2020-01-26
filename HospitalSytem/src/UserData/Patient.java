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
public class Patient extends User {
    protected int age;
    protected String gender;
    
    public Patient(String firstName, String surname, String address, String password, int age, String gender){
        super("P", firstName, surname, address, password);
        
        this.age = age;
        this.gender = gender;
    }
    
    public Patient(String id, String firstName, String surname, String address, String password, int age, String gender){
        super(id, firstName, surname, address, password);
        
        this.age = age;
        this.gender = gender;
    }
    
    //* if you pass in an object *//
    //* public Administator(object){
    //*    super(object);  
    //*
    //*     this.age = age;
    //*     this.gender = gender;
    //* }
   
    
}
