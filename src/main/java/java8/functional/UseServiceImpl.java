package java8.functional;

import java.util.function.Consumer;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/8/15 7:50 PM
 **/
public class UseServiceImpl {
    public static void main(String[] args) {
        UserService userService = () ->{
            System.out.println("aa");
        };



        userService.getFirstUser();
    }


}
