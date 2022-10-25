package spring.el;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/10/14 17:18
 **/
public class PageTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list2.add("d");
        list2.add("e");
        list2.add("f");
        list2.add("g");
        list2.add("h");
        list2.add("i");
        list2.add("g");
        list1.addAll(list2);

//        List<String> strings1 = list1.subList(0, 2);
//        List<String> strings2 = list2.subList(0, 2);
//        strings1.addAll(strings2);
//        strings1.subList(0,2);
        List<String> strings11 = list1.subList(0, 6);
        List<String> strings22 = list2.subList(0, 6);
        strings11.addAll(strings22);
        strings11.subList(2,6);
        System.out.println(list1);
//        System.out.println(strings1);
        System.out.println(list1);
        System.out.println(strings11);


    }
}
