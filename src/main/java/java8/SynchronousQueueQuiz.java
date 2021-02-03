package java8;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/9/21 4:27 PM
 **/
public class SynchronousQueueQuiz {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new SynchronousQueue<>();
        System.out.println(queue.offer(1)+" ");
        System.out.println(queue.offer(2)+" ");
        System.out.println(queue.offer(3)+" ");
        System.out.println(queue.take() + "");
        System.out.println(queue.size());
        String a = "";
        char[] array = a.toCharArray();

    }
}
