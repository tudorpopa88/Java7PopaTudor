/*
 * Counter is a common used instance by 2 parallel threads
 */
package multithreadingjava7;

/**
 * Counter is a common used instance by 2 parallel threads
 *
 * @author tudor
 */
public class Counter {

    private int c = 0;

    synchronized public void increment() {
        c++;
    }

    synchronized public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
}
