package mutithread;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/29 1:30 PM
 **/
public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {


        EvenNumThread evenNumThread = new EvenNumThread();
        OddNumThread oddNumThread = new OddNumThread();
        evenNumThread.run();
        oddNumThread.run();

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
                OddNumThread.class.notify();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 奇数
    public static class OddNumThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {

                    System.out.println(i);
                }
            }
            EvenNumThread.class.notify();
        }
    }
}
