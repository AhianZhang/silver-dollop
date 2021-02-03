package mutithread;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/8/3 3:56 PM
 **/
public class ThreadTest {
    public static void main(String[] args) {

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        threadGroup.list();

        System.out.println(Thread.activeCount());
        System.out.println();
        System.out.println(Thread.getAllStackTraces());
    }
}
