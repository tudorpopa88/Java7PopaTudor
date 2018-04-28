/*
 * Class decrease the value of the Counter
 */
package multithreadingjava7;

/**
 * Class decrease the value of the Counter
 *
 * @author tudor
 */
public class Subtract extends Thread {

    private Counter cSub;
    
    public Subtract(Counter counterFromMain) {
        cSub = counterFromMain;
    }
    
    @Override
    public void run() {
//        Counter c = new Counter();
        for (int i = 0; i < 500; i++) {
            cSub.decrement();
            System.out.println("Decremented to " + cSub.value());
        }
    }

}
