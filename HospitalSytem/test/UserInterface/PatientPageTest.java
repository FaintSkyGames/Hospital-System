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
public class PatientPageTest {
    
    public PatientPageTest() {
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
     * Test of SetDisplayedData method, of class PatientPage.
     */
    @Test
    public void testSetDisplayedData() {
        System.out.println("SetDisplayedData");
        String id = "";
        String name = "";
        String age = "";
        String gender = "";
        String address = "";
        PatientPage instance = new PatientPage();
        instance.SetDisplayedData(id, name, age, gender, address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PatientPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PatientPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddLeaveFeedbackListener method, of class PatientPage.
     */
    @Test
    public void testAddLeaveFeedbackListener() {
        System.out.println("AddLeaveFeedbackListener");
        ActionListener listener = null;
        PatientPage instance = new PatientPage();
        instance.AddLeaveFeedbackListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddDoctorRatingListener method, of class PatientPage.
     */
    @Test
    public void testAddDoctorRatingListener() {
        System.out.println("AddDoctorRatingListener");
        ActionListener listener = null;
        PatientPage instance = new PatientPage();
        instance.AddDoctorRatingListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddRequestAppointmentListener method, of class PatientPage.
     */
    @Test
    public void testAddRequestAppointmentListener() {
        System.out.println("AddRequestAppointmentListener");
        ActionListener listener = null;
        PatientPage instance = new PatientPage();
        instance.AddRequestAppointmentListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddViewHistoryListener method, of class PatientPage.
     */
    @Test
    public void testAddViewHistoryListener() {
        System.out.println("AddViewHistoryListener");
        ActionListener listener = null;
        PatientPage instance = new PatientPage();
        instance.AddViewHistoryListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddPrescription method, of class PatientPage.
     */
    @Test
    public void testAddPrescription() {
        System.out.println("AddPrescription");
        ActionListener listener = null;
        PatientPage instance = new PatientPage();
        instance.AddPrescription(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddTerminationRequestListener method, of class PatientPage.
     */
    @Test
    public void testAddTerminationRequestListener() {
        System.out.println("AddTerminationRequestListener");
        ActionListener listener = null;
        PatientPage instance = new PatientPage();
        instance.AddTerminationRequestListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddLogOutListener method, of class PatientPage.
     */
    @Test
    public void testAddLogOutListener() {
        System.out.println("AddLogOutListener");
        ActionListener listener = null;
        PatientPage instance = new PatientPage();
        instance.AddLogOutListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
