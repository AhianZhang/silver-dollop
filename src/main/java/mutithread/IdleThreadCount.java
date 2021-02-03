package mutithread;

import java.util.concurrent.*;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 1/21/21 5:06 PM
 **/
public class IdleThreadCount {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {

            Future<MyTask> myTaskFuture = executorService.submit(MyTask::new);
            System.out.println(Thread.activeCount() + "=====");
        }

        System.out.println(Thread.activeCount());
    }



}
class MyTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Hello";
    }
}
