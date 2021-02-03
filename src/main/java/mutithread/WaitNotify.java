package mutithread;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/29 1:30 PM
 **/
public class WaitNotify {
    public static void main(String[] args) {


     Thread a = new Thread();
       Thread b = new Thread();
        a.start();
        b.start();

    }

    public static  class evenNumThread implements Runnable{

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {

            }

        }
    }

    public static  class oddNumThread implements Runnable{

        @Override
        public void run() {

        }
    }
}
