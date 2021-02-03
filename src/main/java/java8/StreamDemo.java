package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ahianzhang
 */
public class StreamDemo {
    public static void main(String[] args) {
        createStream();
        streamWithList();
        streamWithCharsOrTokens();

      //  streamWithGenerate();
        convertList();
        convertArray();
        myFlatMap();
    }

    private static void createStream(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4,5});
        stream.forEach(System.out::println);
    }

    private static void streamWithList(){
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.stream().forEach(System.out::println);
    }

    private static void streamWithCharsOrTokens(){
        IntStream intStream = "abcdef".chars();
        intStream.forEach(System.out::println);

        Stream<String> stream = Stream.of("A,B,c".split(","));
        stream.forEach(System.out::println);
    }


    private static void streamWithGenerate(){
        Stream<Date> stream = Stream.generate(Date::new);
        stream.forEach(System.out::println);
    }

    private static void convertList(){
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> collect = list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);
    }


    private static void convertArray(){
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Integer[] array = list.stream().filter(item -> item % 2 == 1).toArray(Integer[]::new);
        for (Integer integer : array) {

            System.out.println(integer);
        }
    }

    private static void myFlatMap(){
        List<Integer> list1 = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>(5);
        for (int i = 5; i < 10; i++) {
            list2.add(i);
        }

        List<List<Integer>> list=Arrays.asList(list1,list2);

        List<Integer> collect = list.stream().flatMap(item -> item.stream())
                .collect(Collectors.toList());
        System.out.println(collect);


    }


}
