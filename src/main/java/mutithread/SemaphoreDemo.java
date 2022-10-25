package mutithread;

import java.util.concurrent.CountDownLatch;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/8/1 13:56
 **/
public class SemaphoreDemo {
    static int num = 0;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    new Thread(()->{
                        add(countDownLatch);
                    }).start();
                }
            }).start();
        }
        countDownLatch.await();
        System.out.println(num);
    }
    private static void add(CountDownLatch countDownLatch){
            num++;
            countDownLatch.countDown();
    }
}
