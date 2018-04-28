/*
 * Tests threads sync
 */
package multithreadingjava7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Tests threads sync
 *
 * @author tudor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter c = new Counter();
        Add add = new Add(c);
        Subtract sub = new Subtract(c);
        System.out.println("Initial value of counter: " + c.value());
        add.start();
        sub.start();
        System.out.println("Final value of counter: " + c.value());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
    }

}
