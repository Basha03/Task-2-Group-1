/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Razia
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
     * Test of main method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        
    }

    /**
     * Test of checkUserNameComplexity method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUserNameComplexity() {
        System.out.println("checkUserNameComplexity");
        String UserName = "Razi_";
        boolean expResult = false;
        boolean result = Login.checkUserNameComplexity(UserName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String Password = "Ba$ha012";
        boolean expResult = false;
        boolean result = Login.checkPasswordComplexity(Password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String UserName = "";
        String Password = "";
        String expResult = "";
        String result = Login.registerUser(UserName, Password);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of LoginUser method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        String UserName = "";
        String Password = "";
        String insPassword = "";
        String insRegUser = "";
        boolean expResult = false;
        boolean result = Login.LoginUser(UserName, Password, insPassword, insRegUser);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of LoginStatus method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testLoginStatus() {
        System.out.println("LoginStatus");
        String UserName = "";
        String Password = "";
        String inpRegUser = "";
        String inpPassword = "";
        String expResult = "";
        String result = Login.LoginStatus(UserName, Password, inpRegUser, inpPassword);
        assertEquals(expResult, result);
        
        
    }
    
}
