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
public class AdministratorPageTest {
    
    public AdministratorPageTest() {
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
     * Test of SetDisplayedData method, of class AdministratorPage.
     */
    @Test
    public void testSetDisplayedData() {
        System.out.println("SetDisplayedData");
        String id = "";
        String name = "";
        String address = "";
        AdministratorPage instance = new AdministratorPage();
        instance.SetDisplayedData(id, name, address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AdministratorPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdministratorPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddDoctorRatingListener method, of class AdministratorPage.
     */
    @Test
    public void testAddDoctorRatingListener() {
        System.out.println("AddDoctorRatingListener");
        ActionListener listener = null;
        AdministratorPage instance = new AdministratorPage();
        instance.AddDoctorRatingListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddNewUserListener method, of class AdministratorPage.
     */
    @Test
    public void testAddNewUserListener() {
        System.out.println("AddNewUserListener");
        ActionListener listener = null;
        AdministratorPage instance = new AdministratorPage();
        instance.AddNewUserListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddRemoveUserListener method, of class AdministratorPage.
     */
    @Test
    public void testAddRemoveUserListener() {
        System.out.println("AddRemoveUserListener");
        ActionListener listener = null;
        AdministratorPage instance = new AdministratorPage();
        instance.AddRemoveUserListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddLogOutListener method, of class AdministratorPage.
     */
    @Test
    public void testAddLogOutListener() {
        System.out.println("AddLogOutListener");
        ActionListener listener = null;
        AdministratorPage instance = new AdministratorPage();
        instance.AddLogOutListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
