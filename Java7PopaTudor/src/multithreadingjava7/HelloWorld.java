/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingjava7;

/**
 *
 * @author tudor
 */
public class HelloWorld extends Thread {
    
    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}
