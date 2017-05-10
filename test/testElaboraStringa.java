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
 * @author aleleo
 */
public class testElaboraStringa {
    
    public testElaboraStringa() {
    }
    SortComparationGUI tst=new SortComparationGUI();
    @Test
    
        public void test() {
            assertEquals("learn.BitonicSort",tst.ElaboraStringa("Bitonic Sort"));
        
    }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
