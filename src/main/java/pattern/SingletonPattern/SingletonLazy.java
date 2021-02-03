package pattern.SingletonPattern;

import java.util.concurrent.TimeUnit;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/25 10:55 PM
 **/
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    /**
     * 单线程
     * @return
     * @throws InterruptedException
     */
    public static SingletonLazy getNormalInstance() throws InterruptedException {

        if (instance == null){
            TimeUnit.SECONDS.sleep(1);
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * 多线程加锁
     * @return
     * @throws InterruptedException
     */
    public synchronized static  SingletonLazy getSynchronizedInstance() throws InterruptedException {

        if (instance == null){
            TimeUnit.SECONDS.sleep(1);
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * private volatile static SingletonLazy instance;
     * @return
     * @throws InterruptedException
     */
    public static  SingletonLazy getDoubleCheckInstance() throws InterruptedException {
        if (instance == null){
            TimeUnit.SECONDS.sleep(1);
            synchronized (SingletonLazy.class){
                if (instance == null){
                    TimeUnit.SECONDS.sleep(2);
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    private static class SingletonHolder{

      private static   SingletonLazy instance = new SingletonLazy();
    }

    public static SingletonLazy getInnerClassInstance() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return SingletonHolder.instance;
    }
}
