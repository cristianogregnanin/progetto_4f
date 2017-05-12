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
 * @author mantovanimarco
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
    
    public void evaluatesExpression(){
        SortComparationGUI tst = new SortComparationGUI();
        String prova = tst.GetNomeClasse("Shaker Sort");
        assertEquals("ShakerSort",prova);
    }
            
    
}
