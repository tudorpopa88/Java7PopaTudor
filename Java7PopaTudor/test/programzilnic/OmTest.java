/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programzilnic;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tudor
 */
public class OmTest {
    
    public OmTest() {
    }

    /**
     * Test of seSpala method, of class Om.
     */
    @Test
    public void testSeSpala() {
        System.out.println("seSpala");
        String message = "Omul se spala ";
        Om instance = new Om();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.seSpala();
        System.out.flush();
        System.setOut(old);
        assertEquals(message, baos.toString());
        
    }

    /**
     * Test of seTrezeste method, of class Om.
     */
    @Test
    public void testSeTrezeste() {
        System.out.println("seTrezeste");
        String message = "Omul se trezeste ";
        Om instance = new Om();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.seTrezeste();
        System.out.flush();
        System.setOut(old);
        assertEquals(message, baos.toString());
    }

    /**
     * Test of mergeLaJob method, of class Om.
     */
    @Test
    public void testMergeLaJob() {
        System.out.println("mergeLaJob");
        String message = "Omul merge la job ";
        Om instance = new Om();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.mergeLaJob();
        System.out.flush();
        System.setOut(old);
        assertEquals(message, baos.toString());
    }

    /**
     * Test of dorm method, of class Om.
     */
    @Test
    public void testDorm() {
        System.out.println("dorm");
        String message = "Omul doarme ";
        Om instance = new Om();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.dorm();
        System.out.flush();
        System.setOut(old);
        assertEquals(message, baos.toString());
    }
    
}
