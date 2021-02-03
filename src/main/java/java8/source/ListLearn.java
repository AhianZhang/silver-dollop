package java8.source;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/1/6 11:33 AM
 **/
public class ListLearn {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode() == o2.hashCode());

        String a = "123";
        String b = "456";
        String c = "456";
        a.hashCode();
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(c.hashCode() == b.hashCode());

        Collection collection;
        List<String> list = new ArrayList<>();

    }
}
