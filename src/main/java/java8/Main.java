package java8;


import pattern.strategy.apple.Apple;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/1 4:30 PM
 **/
public class Main {


    public static void main(String[] args) {


        Function<Apple,Boolean> containsGreen = (Apple a) -> a.getColor().equals("green");
        System.out.println(containsGreen);
        Predicate<Apple> containsGreen1 = (Apple a) -> a.getColor().equals("green");
        System.out.println();

        Supplier<Apple> appleSupplier = Apple :: new;
        Apple apple = appleSupplier.get();
        apple.setColor("yello");
        apple.setWeight("160");
        System.out.println(apple);


//
//        Consumer<Apple> appleConsumer1 =  apple1 -> System.out.println(apple1.getColor());
//        Consumer<Apple> appleConsumer2 =  apple2 -> System.out.println(apple2.getWeight());
//        appleConsumer1.andThen(appleConsumer2).accept(new Apple("a","1000"));
//


//        int a = 128;
//        byte b = (byte)a;
//        System.out.println(b);// -128
//        int c = -127;
//        byte d = (byte) c;
//        System.out.println(d    );
//
////        System.out.println(Integer.valueOf((char)-1));
//        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};



        double a = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        double b =1;
        System.out.println(Double.compare(a, b));

        System.out.println(0.1+0.2);




        if((b - a )< (1^-6)){
//            System.out.println(1);
        }
//        System.out.println(a);


        NumberFormat numberFormat = NumberFormat.getPercentInstance(new Locale("zh-CN"));//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/java_i18n/java_i18n_format_percentages.html

        System.out.println(numberFormat.format(0.2));

        DecimalFormat df = null ;
        df = new DecimalFormat("###.00%") ;
        String str = df.format(0.211) ;
        System.out.println(str);
    }
}
