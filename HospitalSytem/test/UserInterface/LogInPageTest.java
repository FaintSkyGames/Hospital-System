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
public class LogInPageTest {
    
    public LogInPageTest() {
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
     * Test of getID method, of class LogInPage.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        LogInPage instance = new LogInPage();
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LogInPage.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LogInPage instance = new LogInPage();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddSubmitListener method, of class LogInPage.
     */
    @Test
    public void testAddSubmitListener() {
        System.out.println("AddSubmitListener");
        ActionListener sumbitListen = null;
        LogInPage instance = new LogInPage();
        instance.AddSubmitListener(sumbitListen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddNewUserListener method, of class LogInPage.
     */
    @Test
    public void testAddNewUserListener() {
        System.out.println("AddNewUserListener");
        ActionListener newListen = null;
        LogInPage instance = new LogInPage();
        instance.AddNewUserListener(newListen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DisplayErrorMessage method, of class LogInPage.
     */
    @Test
    public void testDisplayErrorMessage() {
        System.out.println("DisplayErrorMessage");
        String errorMessage = "";
        LogInPage instance = new LogInPage();
        instance.DisplayErrorMessage(errorMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ClearUserID method, of class LogInPage.
     */
    @Test
    public void testClearUserID() {
        System.out.println("ClearUserID");
        LogInPage instance = new LogInPage();
        instance.ClearUserID();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ClearPassword method, of class LogInPage.
     */
    @Test
    public void testClearPassword() {
        System.out.println("ClearPassword");
        LogInPage instance = new LogInPage();
        instance.ClearPassword();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
