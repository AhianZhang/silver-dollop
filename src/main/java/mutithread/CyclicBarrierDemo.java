package mutithread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/11 8:08 PM
 **/
public class CyclicBarrierDemo {


    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2,new SayHello());
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName() +" working");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " done");
                cyclicBarrier.await(4, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+" working");
                Thread.sleep(3000);
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + " done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();
    }
}



class SayHello implements Runnable{

    @Override
    public void run() {
        System.out.println("run over Hello world");
    }
}

