package java8;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/1/20 12:11 PM
 **/
public class Binary {
    public static void main(String[] args) {
        int a = 6;
        int b = -6;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a << 1);
        System.out.println(b << 1);

    }
}
