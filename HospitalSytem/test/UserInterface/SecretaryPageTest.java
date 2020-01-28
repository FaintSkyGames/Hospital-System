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
public class SecretaryPageTest {
    
    public SecretaryPageTest() {
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
     * Test of SetDisplayedData method, of class SecretaryPage.
     */
    @Test
    public void testSetDisplayedData() {
        System.out.println("SetDisplayedData");
        String id = "";
        String name = "";
        String address = "";
        SecretaryPage instance = new SecretaryPage();
        instance.SetDisplayedData(id, name, address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SecretaryPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SecretaryPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddNewAccountApproveListener method, of class SecretaryPage.
     */
    @Test
    public void testAddNewAccountApproveListener() {
        System.out.println("AddNewAccountApproveListener");
        ActionListener listener = null;
        SecretaryPage instance = new SecretaryPage();
        instance.AddNewAccountApproveListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddRemoveApproveListener method, of class SecretaryPage.
     */
    @Test
    public void testAddRemoveApproveListener() {
        System.out.println("AddRemoveApproveListener");
        ActionListener listener = null;
        SecretaryPage instance = new SecretaryPage();
        instance.AddRemoveApproveListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddAppointmentRequestListener method, of class SecretaryPage.
     */
    @Test
    public void testAddAppointmentRequestListener() {
        System.out.println("AddAppointmentRequestListener");
        ActionListener listener = null;
        SecretaryPage instance = new SecretaryPage();
        instance.AddAppointmentRequestListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddGiveMedListener method, of class SecretaryPage.
     */
    @Test
    public void testAddGiveMedListener() {
        System.out.println("AddGiveMedListener");
        ActionListener listener = null;
        SecretaryPage instance = new SecretaryPage();
        instance.AddGiveMedListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddOrderMedStockListener method, of class SecretaryPage.
     */
    @Test
    public void testAddOrderMedStockListener() {
        System.out.println("AddOrderMedStockListener");
        ActionListener listener = null;
        SecretaryPage instance = new SecretaryPage();
        instance.AddOrderMedStockListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddRemovePatientsListener method, of class SecretaryPage.
     */
    @Test
    public void testAddRemovePatientsListener() {
        System.out.println("AddRemovePatientsListener");
        ActionListener listener = null;
        SecretaryPage instance = new SecretaryPage();
        instance.AddRemovePatientsListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddLogOutListener method, of class SecretaryPage.
     */
    @Test
    public void testAddLogOutListener() {
        System.out.println("AddLogOutListener");
        ActionListener listener = null;
        SecretaryPage instance = new SecretaryPage();
        instance.AddLogOutListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
