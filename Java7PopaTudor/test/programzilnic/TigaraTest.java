/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programzilnic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tudor
 */
public class TigaraTest {
    
    public TigaraTest() {
    }

    /**
     * Test of arde method, of class Tigara.
     */
    @Test
    public void testArde() {
        System.out.println("arde");
        short lungime = 10;
        Tigara instance = new Tigara();
        assertEquals(lungime, instance.lungime);
    }
    
}
