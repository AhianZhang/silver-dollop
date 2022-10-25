package java8.functional;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/7/27 11:23
 **/
public class Basic {
    public static void main(String[] args) {
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());
        System.out.println(together);

        List<List<Integer>> collect = Stream.of(asList(1, 2), asList(3, 4))
                .map(i -> i)
                .peek(System.out::println)
                .collect(toList())
                ;
//        System.out.println(collect);

//        List<Integer> collect = Stream.of(asList(1, 2), asList(3, 4))
//                .map(i -> i * i)
//                .collect(toList());

//        List<Object> collect1 = Stream.of(asList(1, 2), asList(3, 4))
//                .flatMap(i -> Stream.of(i * i))
//                .collect(toList());

//        System.out.println(collect);
//        System.out.println(collect1);

    }


}
