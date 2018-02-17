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
public class ZiTest {
    
    public ZiTest() {
    }

    /**
     * Test of esteZiLucratoare method, of class Zi.
     */
    @Test
    public void testEsteZiLucratoare() {
        System.out.println("esteZiLucratoare");
        Zi instance = new Zi(true);
        Boolean expResult = true;
        Boolean result = instance.esteZiLucratoare();
        assertEquals(expResult, result);
    }
    
}
