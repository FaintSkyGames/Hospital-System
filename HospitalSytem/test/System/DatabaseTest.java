/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import UserData.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Geri
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Start method, of class Database.
     */
    @Test
    public void testStart() {
        System.out.println("Start");
        Database expResult = null;
        Database result = Database.Start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Database method, of class Database.
     */
    @Test
    public void testDatabase() {
        System.out.println("Database");
        Database instance = new Database();
        instance.Database();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GenerateDatabase method, of class Database.
     */
    @Test
    public void testGenerateDatabase() {
        System.out.println("GenerateDatabase");
        Database instance = new Database();
        instance.GenerateDatabase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetUser method, of class Database.
     */
    @Test
    public void testGetUser_String() {
        System.out.println("GetUser");
        String id = "";
        User expResult = null;
        User result = Database.GetUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetUser method, of class Database.
     */
    @Test
    public void testGetUser_3args() {
        System.out.println("GetUser");
        String firstName = "";
        String surname = "";
        String address = "";
        User expResult = null;
        User result = Database.GetUser(firstName, surname, address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetDoctors method, of class Database.
     */
    @Test
    public void testGetDoctors() {
        System.out.println("GetDoctors");
        ArrayList expResult = null;
        ArrayList result = Database.GetDoctors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAdmins method, of class Database.
     */
    @Test
    public void testGetAdmins() {
        System.out.println("GetAdmins");
        ArrayList expResult = null;
        ArrayList result = Database.GetAdmins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPatients method, of class Database.
     */
    @Test
    public void testGetPatients() {
        System.out.println("GetPatients");
        ArrayList expResult = null;
        ArrayList result = Database.GetPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetSecs method, of class Database.
     */
    @Test
    public void testGetSecs() {
        System.out.println("GetSecs");
        ArrayList expResult = null;
        ArrayList result = Database.GetSecs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetNumberOfAdmins method, of class Database.
     */
    @Test
    public void testGetNumberOfAdmins() {
        System.out.println("GetNumberOfAdmins");
        int expResult = 0;
        int result = Database.GetNumberOfAdmins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetNumberOfDoctors method, of class Database.
     */
    @Test
    public void testGetNumberOfDoctors() {
        System.out.println("GetNumberOfDoctors");
        int expResult = 0;
        int result = Database.GetNumberOfDoctors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetNumberOfPatients method, of class Database.
     */
    @Test
    public void testGetNumberOfPatients() {
        System.out.println("GetNumberOfPatients");
        int expResult = 0;
        int result = Database.GetNumberOfPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetNumberOfSecretaries method, of class Database.
     */
    @Test
    public void testGetNumberOfSecretaries() {
        System.out.println("GetNumberOfSecretaries");
        int expResult = 0;
        int result = Database.GetNumberOfSecretaries();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddUserToDatabase method, of class Database.
     */
    @Test
    public void testAddUserToDatabase() {
        System.out.println("AddUserToDatabase");
        User user = null;
        Database.AddUserToDatabase(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveUserFromDatabase method, of class Database.
     */
    @Test
    public void testRemoveUserFromDatabase() {
        System.out.println("RemoveUserFromDatabase");
        String userID = "";
        Database.RemoveUserFromDatabase(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveRequestFromDatabase method, of class Database.
     */
    @Test
    public void testRemoveRequestFromDatabase() {
        System.out.println("RemoveRequestFromDatabase");
        String userID = "";
        String type = "";
        Database.RemoveRequestFromDatabase(userID, type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
