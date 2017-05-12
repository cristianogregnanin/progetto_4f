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
 * @author andrea
 */
public class SortComparationGUITest {
    
    public SortComparationGUITest() {
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
     * Test of GetNomeClasse method, of class SortComparationGUI.
     */
    @Test
    public void testGetNomeClasse() {
        SortComparationGUI clTest = new SortComparationGUI();
        String nomeClasse = clTest.GetNomeClasse("Counting Sort");
        assertEquals("CountingSort", nomeClasse);
    }

    /**
     * Test of main method, of class SortComparationGUI.
     */
    
}
