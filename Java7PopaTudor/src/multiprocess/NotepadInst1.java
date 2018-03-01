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
public class NotepadInst1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Opening notepad 1");
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
