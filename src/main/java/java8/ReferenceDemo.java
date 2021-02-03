package java8;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/9/9 10:53 AM
 **/
public class ReferenceDemo {
    public static void main(String[] args) {
        Object count = new Object();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        PhantomReference<Object> phantomReference = new PhantomReference<>(count,referenceQueue);
        count = null;
        System.gc();
        Reference<Object> ref = null;
        try {
            ref = referenceQueue.remove(1000L);//
            ref = referenceQueue.poll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ref != null){
            System.out.println(count);
            System.out.println(ref);
        }

    }
}
