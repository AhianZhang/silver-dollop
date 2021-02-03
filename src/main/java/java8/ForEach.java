package java8;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author ahianzhang
 */
public class ForEach {
    public static void main(String[] args) {
//    ForEach.forEachWithStream();
//    ForEach.forEachWithMap();
//    ForEach.customConsumer();
//    ForEach.forEachWithList();
        System.out.println(contains());
    }


    private static void forEachWithStream() {
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
        Consumer<Integer> action = System.out::println;

        numberList.stream().filter(n -> n % 2 == 0).forEach(action);
    }

    private static void forEachWithList(){
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
        Consumer<Integer> action = System.out::println;

        numberList.forEach(action);
    }

    private static void forEachWithMap(){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        //1. Map entries
        Consumer<Map.Entry<String,Integer>> action = System.out::println;
        map.entrySet().forEach(action);

        //2. map keys
        Consumer<String> actionKeys = System.out::println;
        map.keySet().forEach(actionKeys);


        //3. map values
        Consumer<Integer> actionValues = System.out::println;
        map.values().forEach(actionValues);

    }


    private static void customConsumer(){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Consumer<Map.Entry<String,Integer>> myAction = entry ->{
            System.out.println("key: "+ entry.getKey());
            System.out.println("value: "+ entry.getValue());
        };
        map.entrySet().forEach(myAction);
    }


    private static boolean contains(){
        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        list1.add(1L);
        list1.add(2L);
        list1.add(3L);
        list2.add(3L);
        list2.add(4L);
        list2.add(5L);

        return list1.contains(list2);

    }
}



