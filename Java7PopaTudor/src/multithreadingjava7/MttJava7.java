/*
 * Program launches to different threads
 */
package multithreadingjava7;

/**
 *
 * @author tudor
 */
public class MttJava7 {
    
    public static void main(String[] args) throws InterruptedException {
        //creat 2 class/threads instances
        HelloWorld thread1 = new HelloWorld();
        SalutLume thread2 = new SalutLume();
        
        thread1.start();
        //get default priorities
        System.out.println("Prioritate thread 1 " + thread1.getPriority());
        System.out.println("Prioritate thread 2 " + thread2.getPriority());
        //set priorities
        //thread2.setPriority(10);
        //thread1.setPriority(1);
        //set sleeping time
        Thread.sleep(4000L);
        //start the threads
        thread2.start();
        thread2.interrupt();
    }
}
