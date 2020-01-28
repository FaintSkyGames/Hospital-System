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
public class ViewFeedbackTest {
    
    public ViewFeedbackTest() {
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
     * Test of SetComboBoxData method, of class ViewFeedback.
     */
    @Test
    public void testSetComboBoxData() {
        System.out.println("SetComboBoxData");
        Object[] ids = null;
        ViewFeedback instance = new ViewFeedback();
        instance.SetComboBoxData(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ViewFeedback.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ViewFeedback.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetDoctors method, of class ViewFeedback.
     */
    @Test
    public void testSetDoctors() {
        System.out.println("SetDoctors");
        Object[] doctorIDs = null;
        ViewFeedback instance = new ViewFeedback();
        instance.SetDoctors(doctorIDs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetCurrentDoctor method, of class ViewFeedback.
     */
    @Test
    public void testGetCurrentDoctor() {
        System.out.println("GetCurrentDoctor");
        ViewFeedback instance = new ViewFeedback();
        String expResult = "";
        String result = instance.GetCurrentDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetDoctorName method, of class ViewFeedback.
     */
    @Test
    public void testSetDoctorName() {
        System.out.println("SetDoctorName");
        String name = "";
        ViewFeedback instance = new ViewFeedback();
        instance.SetDoctorName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetAddress method, of class ViewFeedback.
     */
    @Test
    public void testSetAddress() {
        System.out.println("SetAddress");
        String address = "";
        ViewFeedback instance = new ViewFeedback();
        instance.SetAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddAdminReturnListener method, of class ViewFeedback.
     */
    @Test
    public void testAddAdminReturnListener() {
        System.out.println("AddAdminReturnListener");
        ActionListener listener = null;
        ViewFeedback instance = new ViewFeedback();
        instance.AddAdminReturnListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddDocotorChangeListener method, of class ViewFeedback.
     */
    @Test
    public void testAddDocotorChangeListener() {
        System.out.println("AddDocotorChangeListener");
        ActionListener listener = null;
        ViewFeedback instance = new ViewFeedback();
        instance.AddDocotorChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddSubmitFeedbackSummaryListener method, of class ViewFeedback.
     */
    @Test
    public void testAddSubmitFeedbackSummaryListener() {
        System.out.println("AddSubmitFeedbackSummaryListener");
        ActionListener listener = null;
        ViewFeedback instance = new ViewFeedback();
        instance.AddSubmitFeedbackSummaryListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
