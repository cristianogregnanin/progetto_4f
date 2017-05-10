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
 * @author pietro
 */
public class ElaboraStringaTest {
    
    @Test
    public void TestStringa()
    {
        SortComparationGUI o=new SortComparationGUI();
        String s=o.ElaboraStringa("Shell Sort");
        assertEquals("learn.ShellSort",s);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
