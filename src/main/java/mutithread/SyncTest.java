package mutithread;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/8/3 3:56 PM
 **/
public class SyncTest extends Thread{
    @Override
    public void run() {
       send();
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            new SyncTest().start();
        }
    }
    public void send(){
        System.out.println(Thread.currentThread().getName() + " sent");

        save();
    }
    private void save(){
        System.out.println(Thread.currentThread().getName() + " save");
    }
}
