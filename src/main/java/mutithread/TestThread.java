package mutithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/8 12:38 AM
 **/
public class TestThread {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 测试主线程阻塞等待
        {
//            NormalThread normalThread = new NormalThread();
//            normalThread.start();
//            while (normalThread.name == null) {
//                Thread.sleep(1000);
//            }
//            System.out.println(normalThread.name);
        }
        //测试 join 阻塞获取返回值
        {
//            NormalThread normalThread = new NormalThread();
//            normalThread.start();
//            normalThread.join();
//            System.out.println(normalThread.name);
        }

        // 测试Runnable
        {
//        Thread t = new Thread(new RunnableTest());
//        t.start();
        }

        {
            FutureTask<String> futureTask = new FutureTask<String>(new CallableTest());
            new Thread(futureTask).start();
            if (!futureTask.isDone()){
                System.out.println("handling");
            }
            System.out.println("get result: "+ futureTask.get());
        }

    }

}
class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"运行了");
    }
}
class CallableTest implements Callable<String>{
    @Override
    public String call() throws Exception {
        String val = "test callable";
        System.out.println("call running");
        Thread.sleep(4000);

        return val;
    }
}

class NormalThread extends Thread{
    public String name;

    @Override
    public void run() {
        System.out.println("普通的线程执行了");
        this.name="ahian";
    }
}
