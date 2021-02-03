package mutithread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 1/20/21 9:36 AM
 **/
public class CallableFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> future = executorService.submit(() -> new Random().nextInt());

        try {
            // blocking
            Integer result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
