/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucapaulon
 */
//tasto destro su SortComparatioGUITest e poi debug file per debuggare
public class SortComparationGUITest {
    /**
     * Test of main method, of class SortComparationGUI.
     */
    @Test
  public void evaluatesExpression() {
     SortComparationGUI o = new SortComparationGUI();
    String stringa = o.ElaboraStringa("Merge Sort");
    assertEquals("MergeSort", stringa);
  }   
}
