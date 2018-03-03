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
public class Femeie extends Thread {

    @Override
    public void run() {
        System.out.println("Femeia sforaie");
        Thread threadTigara = new Tigara();
        threadTigara.start();
    }
    
    
}
