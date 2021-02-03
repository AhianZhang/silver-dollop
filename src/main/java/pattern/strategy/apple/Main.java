package pattern.strategy.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/11/4 2:27 PM
 **/
public class Main {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple("green", "20"), new Apple("yellow", "30"));

        System.out.println(findApples(apples, new GreenAppleFilter()).toString());

        List<Apple> green = findApples(apples, apple -> apple.getColor().equals("green"));
        System.out.println(green);
    }


    private static List<Apple> findApples(List<Apple> apples,AppleFilter appleFilter){
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : apples) {

            if (appleFilter.filter(apple)){
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }
}
