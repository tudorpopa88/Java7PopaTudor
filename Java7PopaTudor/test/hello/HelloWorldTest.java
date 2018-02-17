/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tudor
 */
public class HelloWorldTest {
    
    public HelloWorldTest() {
    }

    /**
     * Test of main method, of class HelloWorld.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String message = "Hello world! ";
        HelloWorld instance = new HelloWorld();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        String[] args = new String[0];
        instance.main(args);
        System.out.flush();
        System.setOut(old);
        assertEquals(message, baos.toString());
    }
    
}
