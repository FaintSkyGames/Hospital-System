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
public class DoctorPageTest {
    
    public DoctorPageTest() {
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
     * Test of SetDisplayedData method, of class DoctorPage.
     */
    @Test
    public void testSetDisplayedData() {
        System.out.println("SetDisplayedData");
        String id = "";
        String name = "";
        String address = "";
        DoctorPage instance = new DoctorPage();
        instance.SetDisplayedData(id, name, address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DoctorPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DoctorPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddViewAppointmentsListener method, of class DoctorPage.
     */
    @Test
    public void testAddViewAppointmentsListener() {
        System.out.println("AddViewAppointmentsListener");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddViewAppointmentsListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddNotesListener method, of class DoctorPage.
     */
    @Test
    public void testAddNotesListener() {
        System.out.println("AddNotesListener");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddNotesListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddViewHistoryListener method, of class DoctorPage.
     */
    @Test
    public void testAddViewHistoryListener() {
        System.out.println("AddViewHistoryListener");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddViewHistoryListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddCreateAppointmentListener method, of class DoctorPage.
     */
    @Test
    public void testAddCreateAppointmentListener() {
        System.out.println("AddCreateAppointmentListener");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddCreateAppointmentListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddPrescription method, of class DoctorPage.
     */
    @Test
    public void testAddPrescription() {
        System.out.println("AddPrescription");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddPrescription(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddCreateMedicineListener method, of class DoctorPage.
     */
    @Test
    public void testAddCreateMedicineListener() {
        System.out.println("AddCreateMedicineListener");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddCreateMedicineListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddMedicationOrderListener method, of class DoctorPage.
     */
    @Test
    public void testAddMedicationOrderListener() {
        System.out.println("AddMedicationOrderListener");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddMedicationOrderListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddLogOutListener method, of class DoctorPage.
     */
    @Test
    public void testAddLogOutListener() {
        System.out.println("AddLogOutListener");
        ActionListener listener = null;
        DoctorPage instance = new DoctorPage();
        instance.AddLogOutListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
