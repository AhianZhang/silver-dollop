package java8;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/1/23 1:26 PM
 **/
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Random random = new Random(10);
        System.out.println("q init size: "+q.size());
        for (int i = 0; i < 5; i++) {
            int nextInt = random.nextInt(100);
            q.offer(nextInt);
            System.out.println("queue add : " + nextInt +" dynamic q size: "+q.size());
        }
        // peek one
        System.out.println(q.peek());
        // take one
        System.out.println(q.poll());
        System.out.println("q size: "+q.size());
        System.out.println(q.peek());
        System.out.println("q size: "+q.size());

    }
}
