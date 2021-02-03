package mutithread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/29 5:07 PM
 **/
public class SchedulerExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(new Runnable() {
                                                @Override
                                                public void run() {
                                                    System.out.println(1);
                                                }
                                            }, 1, 10, TimeUnit.SECONDS
        );

    }
}
