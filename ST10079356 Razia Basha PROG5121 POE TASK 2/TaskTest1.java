/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Razia
 */
public class TaskTest1 {
    
    public TaskTest1() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    /**
     * Test of Status_desc method, of class Task.
     */
    @Test
    public void testStatus_desc() {
        System.out.println("Status_desc");
        Task instance = new Task();
        String expResult = "";
        String result = instance.Status_desc();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    /**
     * Test of Name method, of class Task.
     */
    @Test
    public void testName_0args() {
        System.out.println("name");
        Task instance = new Task();
        String expResult = "";
        String result = instance.Name();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    /**
     * Test of Name method, of class Task.
     */
    @Test
    public void testName_String() {
        System.out.println("name");
        String name = "";
        Task instance = new Task();
        instance.Name(name);
        
        fail("The test case is a prototype.");
    }
     /**
     * Test of Dev_fname method, of class Task.
     */
    @Test
    public void testDev_fname_0args() {
        System.out.println("Dev_fname");
        Task instance = new Task();
        String expResult = "";
        String result = instance.Dev_fname();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    /**
     * Test of Dev_fname method, of class Task.
     */
    @Test
    public void testDev_fname_String() {
        System.out.println("Dev_fname");
        String dev_fe = "";
        Task instance = new Task();
        instance.Dev_fname(dev_fe);
        
        fail("The test case is a prototype.");
    }
     /**
     * Test of Dev_surname method, of class Task.
     */
    @Test
    public void testDev_surname_0args() {
        System.out.println("Dev_surname");
        Task instance = new Task();
        String expResult = "";
        String result = instance.Dev_surname();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    /**
     * Test of Dev_surname method, of class Task.
     */
    @Test
    public void testDev_surname_String() {
        System.out.println("Dev_surname");
        String dev_surname = "";
        Task instance = new Task();
        instance.Dev_surname(dev_surname);
        
        fail("The test case is a prototype.");
    }
    /**
     * Test of Description method, of class Task.
     */
    @Test
    public void testDescription_0args() {
        System.out.println("Description");
        Task instance = new Task();
        String expResult = "";
        String result = instance.Description();
        assertEquals(expResult, result);
       
        fail("The test case is a prototype.");
    }
    /**
     * Test of Description method, of class Task.
     */
    @Test
    public void testDescription_String() {
        System.out.println("Description");
        String description = "";
        Task instance = new Task();
        instance.Description(description);
        
        fail("The test case is a prototype.");
    }
    /**
     * Test of Status method, of class Task.
     */
    @Test
    public void testStatus_0args() {
        System.out.println("Status");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.Status();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of Status method, of class Task.
     */
    @Test
    public void testStatus_int() {
        System.out.println("Status");
        int status = 0;
        Task instance = new Task();
        instance.Status(status);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of Duration method, of class Task.
     */
    @Test
    public void testDuration_0args() {
        System.out.println("Duration");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.Duration();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of Duration method, of class Task.
     */
    @Test
    public void testDuration_int() {
        System.out.println("Duration");
        int duration = 0;
        Task instance = new Task();
        instance.Duration(duration);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of Enroll_inputs method, of class Task.
     */
    @Test
    public void testEnroll_inputs() {
        System.out.println("Enroll_inputs");
        Task[] assoc = null;
        int runs = 0;
        Task instance = new Task();
        instance.Enroll_inputs(assoc, runs);
        
        fail("The test case is a prototype.");
    }
    
}
