/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package describedscene;

/**
 *
 * @author tudor
 */
public class ScenaMain {
    
    public static void main(String[] args) {
        
        Thread threadFemeie = new Femeie();
        threadFemeie.start();
        threadFemeie.setPriority(10);
        try {
            Thread.sleep(3000L);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
        Thread threadTelevizor = new Televizor();
        threadTelevizor.start();
        
    }
}
