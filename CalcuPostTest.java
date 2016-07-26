/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class CalcuPostTest {
    
    public CalcuPostTest() {
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
     * Test of Calcular method, of class CalcuPost.
     */
    @Test
    public void testCalcular() {
        System.out.println("Calcular");
        String vector = "";
        CalcuPost instance = new CalcuPost();
        int expResult = 0;
        int result = instance.Calcular(vector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of LeerArchivo method, of class CalcuPost.
     */
   
    /**
     * Test of toString method, of class CalcuPost.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CalcuPost instance = new CalcuPost();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
