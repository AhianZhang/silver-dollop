package mutithread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/29 1:30 PM
 **/
public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {


        EvenNumThread evenNumThread = new EvenNumThread();
        OddNumThread oddNumThread = new OddNumThread();
        Thread threadA = new Thread(evenNumThread);
        Thread threadB = new Thread(oddNumThread);
        threadA.start();
        threadB.start();

    }

    // 偶数
    public  static class EvenNumThread implements Runnable {

        @Override
        public synchronized void run() {

            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {

                    System.out.println(i);
                }

            }

            try {
                OddNumThread.class.notifyAll();
                this.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 奇数
    public static class OddNumThread implements Runnable {

        @Override
        public synchronized void run() {
            List<String> list = new ArrayList<>();
            List<String> collect = list.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());


            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {

                    System.out.println(i);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            EvenNumThread.class.notify();
        }
    }
}
