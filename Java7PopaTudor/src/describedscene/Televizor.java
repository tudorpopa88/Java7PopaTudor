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
public class Televizor extends Thread {

    @Override
    public void run() {
        System.out.println("Televizorul transmite emisiunea preferata");
        Thread threadBarbat = new Barbat();
        threadBarbat.start();
    }
    
    
}
