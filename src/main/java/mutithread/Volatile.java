package mutithread;

import java.util.concurrent.TimeUnit;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/8/3 2:59 PM
 **/
public class Volatile {
 private static int num = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (num == 0){}
        }).start();
        TimeUnit.SECONDS.sleep(1);

        num = 1;
        System.out.println(num);
    }
}
