package mutithread;

import java.util.concurrent.TimeUnit;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2/1/21 10:10 AM
 **/
public interface PrintCallback {
    void print(String msg);
}
class Work{
    public void doWork(PrintCallback callback){
        System.out.println("working");
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.print("work is done!!");
    }

    public static void main(String[] args) {
        Work work = new Work();
        work.doWork(new PrintCallback() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }

        });
    }
}

