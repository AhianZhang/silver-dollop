package pattern.factory.simple;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-11-25 15:49
 **/
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        CarCreater benz = factory.createCar("benz");
        benz.create();
    }
}
