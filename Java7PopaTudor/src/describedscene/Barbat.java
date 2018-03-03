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
public class Barbat extends Thread {

    @Override
    public void run() {
        System.out.println("Barbatul foloseste aspiratorul");
        Thread threadAspirator = new Aspirator();
        threadAspirator.start();
        System.out.println("Barbatul trezeste femeia: \n\tAuzi! Incepe emisiunea ta! Trezeste-te!");
    }
    
    
}
