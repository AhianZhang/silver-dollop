package mutithread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;
import java.util.concurrent.*;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2/17/21 10:03 PM
 **/
public class ThreadPoolDemo {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    public static void main(String[] args) {
        TimeUnit unit;
        BlockingQueue workQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>((Integer.MAX_VALUE)));
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("活跃线程数: "+threadPoolExecutor.getActiveCount());
            System.out.println("核心线程大小：" + threadPoolExecutor.getCorePoolSize());
            System.out.println("工作队列：" + threadPoolExecutor.getQueue());
            System.out.println("活跃线程数: "+threadPoolExecutor.getActiveCount());
            System.out.println("工厂"+threadPoolExecutor.getThreadFactory());
            Stack stack = new Stack();
            int[] a = new int[9];

            threadPoolExecutor.execute(new ThreadDemo());
        }
    }


}


class ThreadDemo implements Runnable{
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("工作了");
    }
}

