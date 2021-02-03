package java8;

import java.util.Objects;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/9/8 4:49 PM
 **/
public class ObjectNull {
    public static void main(String[] args) {
        String a = null;
        System.out.println(Objects.isNull(a));
        Object o = Objects.requireNonNull(a);
        System.out.println(o);
    }
}
