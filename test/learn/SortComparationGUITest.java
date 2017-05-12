/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nico99
 */
public class SortComparationGUITest {
    
    public SortComparationGUITest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of main method, of class SortComparationGUI.
     */
    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        SortComparationGUI.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    public void evaluatesExpression() {
     SortComparationGUI test = new SortComparationGUI();
     String provaStringa = test.GetClassName("Bubble Sort");
     assertEquals("BubbleSort", provaStringa);
    }
    public void evaluatesSort() {
     SortComparationGUI test = new SortComparationGUI();
     int[] p = new int[5];
     p[0] = 1;
     p[1] = 2;
     p[2] = 3;
     p[3] = 4;
     p[4] = 5;
     int[] vTest = new int[5];
     vTest[0] = 2;
     vTest[1] = 1;
     vTest[2] = 5;
     vTest[3] = 4;
     vTest[4] = 3;
     assertEquals(p, vTest);
    }
    //tools, create test
    //debug file
}
