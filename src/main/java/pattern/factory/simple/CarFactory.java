package pattern.factory.simple;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-11-25 15:37
 **/
public class CarFactory {

   CarCreater createCar(String name){
       if ("benz".equals(name)){
           return new BenzCar();
       }else if ("chevrolet".equals(name)){
           return new ChevroletCar();
       }else {
           throw  new IllegalArgumentException();
       }
    }

}
