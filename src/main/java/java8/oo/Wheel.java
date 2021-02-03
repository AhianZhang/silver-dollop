package java8.oo;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2/1/21 10:26 AM
 **/
public class Wheel extends Car{
    public Wheel() {
        System.out.println("wheel constructor");

    }

    static {
        System.out.println("wheel static block");
    }
    @Override
    public void build() {
        super.build();
        System.out.println("wheel method");
    }


    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        wheel.build();
    }
}
