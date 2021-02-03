package java8.oo;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2/1/21 10:21 AM
 **/
public class Car {
    static {
        System.out.println("car static block");
    }

    public Car() {
        System.out.println("car constructor");
    }

    public void build(){
        System.out.println("car normal  method");
    }
    public static void test(){
        System.out.println("car static method");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.build();
       test();
    }
}
