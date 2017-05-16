/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import learn.SortComparationGUI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex99
 */
public class TestUnitario {
    
    @Test
    public void evaluateExpression()
    {
        SortComparationGUI nome = new SortComparationGUI();
        String s = nome.TogliSpazio("Redix Sort");
        assertEquals("RedixSort", s);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
