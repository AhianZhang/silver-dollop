package mutithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-10 17:45
 **/
public class FixedExecutorDemo {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(7);
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        Thread thread4 = new MyThread();
        Thread thread5 = new MyThread();
        Thread thread6 = new MyThread();
        Thread thread7 = new MyThread();

        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.execute(thread4);
        thread5.interrupt();
        pool.execute(thread5);
        pool.execute(thread6);
        pool.execute(thread7);

        if (!pool.isTerminated()){
            pool.shutdown();
            System.out.println("shut down");
            Thread.sleep(1);
        }


    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
