package mutithread.future;

import java.util.Optional;
import java.util.concurrent.*;

/**
 * Callable 比 Runable 多个返回值，并且支持范型
 * 使用方式：向 thread pool 提交一个 callable task，返回一个 future 对象
 * 对于这个 future 可以设置 超时、等待、取消、判断是否完成的操作
 * @author ahianzhang
 * @version 1.0
 * @date 2/3/21 5:58 PM
 **/
public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello world";
            }
        });

        Optional.ofNullable(submit.get()).ifPresent(System.out::println);
        if (submit.isDone()){
            executorService.shutdown();
        }
    }
}
