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
public class StackTest {
    
    public StackTest() {
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
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        Stack instance = new Stack();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pop method, of class Stack.
     */
    
        
    

    /**
     * Test of IsEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        Stack instance = new Stack();
        boolean expResult = true;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Size method, of class Stack.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        Stack instance = new Stack();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of get method, of class Stack.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Stack instance = new Stack();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
