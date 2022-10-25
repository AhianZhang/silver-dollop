package java8;

import java.util.TreeMap;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/1/23 3:06 PM
 **/
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1,1);
        treeMap.put(2,1);
        treeMap.put(3,4);
        treeMap.put(15,48);
        treeMap.put(5,8);


        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.firstKey());
    }
}
