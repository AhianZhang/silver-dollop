package java8.functional;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 11/18/20 10:27 AM
 **/
public class Main {

    public static void main(String[] args) {

        new Thread(()->{
            create();
        }).start();

        new Thread(()->{
            create();
        }).start();

        new Thread(()->{
            create();
        }).start();}
    private static void  create(){
        Product product = new Product();
        product.setAddress(new Address("beijing",Thread.currentThread().getName()));

        ProductItem iphone = new ProductItem("iphone", BigDecimal.valueOf(6599.00));
        ProductItem apple = new ProductItem("apple", BigDecimal.valueOf(66.10));
        product.setProductItems(Arrays.asList(iphone,apple));
        System.out.println(product);
    }
}
