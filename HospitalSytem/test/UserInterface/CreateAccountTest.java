/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.event.ActionListener;
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
public class CreateAccountTest {
    
    public CreateAccountTest() {
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
     * Test of main method, of class CreateAccount.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CreateAccount.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetUserType method, of class CreateAccount.
     */
    @Test
    public void testGetUserType() {
        System.out.println("GetUserType");
        CreateAccount instance = new CreateAccount();
        String expResult = "";
        String result = instance.GetUserType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetFirstName method, of class CreateAccount.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("GetFirstName");
        CreateAccount instance = new CreateAccount();
        String expResult = "";
        String result = instance.GetFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetSurname method, of class CreateAccount.
     */
    @Test
    public void testGetSurname() {
        System.out.println("GetSurname");
        CreateAccount instance = new CreateAccount();
        String expResult = "";
        String result = instance.GetSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAddress method, of class CreateAccount.
     */
    @Test
    public void testGetAddress() {
        System.out.println("GetAddress");
        CreateAccount instance = new CreateAccount();
        String expResult = "";
        String result = instance.GetAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPassword method, of class CreateAccount.
     */
    @Test
    public void testGetPassword() {
        System.out.println("GetPassword");
        CreateAccount instance = new CreateAccount();
        String expResult = "";
        String result = instance.GetPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddAdminReturnListener method, of class CreateAccount.
     */
    @Test
    public void testAddAdminReturnListener() {
        System.out.println("AddAdminReturnListener");
        ActionListener listener = null;
        CreateAccount instance = new CreateAccount();
        instance.AddAdminReturnListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddSubmitNewUserListener method, of class CreateAccount.
     */
    @Test
    public void testAddSubmitNewUserListener() {
        System.out.println("AddSubmitNewUserListener");
        ActionListener listener = null;
        CreateAccount instance = new CreateAccount();
        instance.AddSubmitNewUserListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
