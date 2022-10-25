package algorihtm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/26 1:09 PM
 **/
public class GrabTest {
    /**
     * 一副牌中发五张扑克牌：判断数字的组成：
     * 有以下几种情况：
     * 1：四条：即四张一样数值的牌（牌均不论花色）
     * 2：三条带一对
     * 3：三条带两张不相同数值的牌
     * 4：两对
     * 5：顺子  包括 10，J，Q，K，A
     * 6：只有一对
     * 7：什么都不是
     * 编程实现以上功能。
     * {A,A,A,A,2} 四条
     * {2,2,3,3,4} 两对
     * {5,5,5,4,4} 三条带一对
     * {5,5,5,3,4}三条带两张不相同数值的牌
     * {10，J，Q，K，A} 顺子
     * {10,10,A,K,Q} 只有一对
     * 什么都不是
     */
    public static void main(String[] args) {
//        String[] arr ={"10","8","6","12","13"} ;
//        String[] arr ={"10","11","12","13","9"} ;
//        String[] arr ={"10","10","12","13","9"} ;
//        String[] arr = {"10", "10", "10", "13", "9"};
        String[] arr ={"10","J","Q","K","A"} ;
//        String[] arr = {"A", "2", "3", "4", "5"};
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "A") arr[i] = "1";
            if (arr[i] == "J") arr[i] = "11";
            if (arr[i] == "Q") arr[i] = "12";
            if (arr[i] == "K") arr[i] = "13";
            temp[i] = Integer.valueOf(arr[i]);
        }

        System.out.println(findKind(temp));
    }

    private static String findKind(int[] arr) {

        List<Integer> poker = new ArrayList<>(14);

        for (int i = 0; i < 14; i++) {
            poker.add(0);
        }
        for (int j : arr) {
            poker.set(j, poker.get(j) + 1);
        }
        if (poker.contains(4)) {
            return "四条";
        } else if (poker.contains(3)) {
            if (poker.contains(2)) {
                return "三带一";
            } else {
                return "三条带两张不相同数值的牌";
            }

        } else if (poker.contains(2)) {
            if (poker.stream().filter(e -> e == 2).count() == 2) {
                return "两对";
            } else {
                return "只有一对";
            }
        } else if (poker.contains(1)) {
            if (Math.abs(poker.indexOf(1) - poker.lastIndexOf(1)) < 5) {
                return "顺子";
            } else {
                if (poker.get(10) == 1 && poker.get(11) == 1 && poker.get(12) == 1 && poker.get(13) == 1 && poker.get(1) == 1)
                    return "顺子";
            }

        }
        return "什么都不是";
    }


}



