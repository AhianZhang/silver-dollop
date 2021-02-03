package mutithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-10 15:20
 **/
public class CallableDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        List<Future<Integer>> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            Integer num = random.nextInt(10);
            FactorialCalculator  calculator = new FactorialCalculator(num);
            Future<Integer> future = executor.submit(calculator);
            list.add(future);
        }
        for(Future<Integer> future : list)
        {
            try
            {
                System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();

    }
}
