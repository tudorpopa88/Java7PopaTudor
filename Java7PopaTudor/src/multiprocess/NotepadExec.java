/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiprocess;

import java.io.IOException;

/**
 *
 * @author tudor
 */
public class NotepadExec {

    public static void main(String[] args) {
        
        Thread t1 = new NotepadInst1();
        Thread t2 = new NotepadInst2();
        Thread t3 = new NotepadInst3();
        t1.start();
        t2.start();
        t3.start();
    }
}
