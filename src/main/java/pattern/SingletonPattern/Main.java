package pattern.SingletonPattern;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/25 10:46 PM
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        SingletonHungry singletonHungry = SingletonHungry.getInstance();
//        SingletonHungry singletonHungry1 = SingletonHungry.getInstance();
//        System.out.println(singletonHungry);
//        System.out.println(singletonHungry1);
//        SingletonLazy singletonLazy = SingletonLazy.getNormalInstance();
//        SingletonLazy singletonLazy1 = SingletonLazy.getNormalInstance();
//        System.out.println(singletonLazy);
//        System.out.println(singletonLazy1);

//        new Thread(()->{
//            SingletonHungry mutiThreadSingletonHungry = SingletonHungry.getInstance();
//            System.out.println(mutiThreadSingletonHungry);
//
//        }).start();
//        new Thread(()->{
//            SingletonHungry mutiThreadSingletonHungry1 = SingletonHungry.getInstance();
//            System.out.println(mutiThreadSingletonHungry1);
//        }).start();


        new Thread(()->{
            try {
                System.out.println(SingletonLazy.getInnerClassInstance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }).start();
        new Thread(()->{

            try {
                System.out.println(SingletonLazy.getInnerClassInstance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        SingletonLazy normalInstance = SingletonLazy.getInnerClassInstance();
        System.out.println(normalInstance);
    }

}
