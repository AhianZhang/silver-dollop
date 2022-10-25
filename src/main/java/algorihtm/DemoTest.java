package algorihtm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/27 11:16 AM
 **/
public class DemoTest {
    /**
     * aabbbccccddcc
     * <p>
     * <p>
     * <p>
     * c 4
     */

    public static void main(String[] args) {
        String s = "aabbbccccddcc";
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");
        String currentDay = formatter.format(new Date());
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            if (map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i]) + 1);
            }else {
                map.put(chars[i],1);
            }

            System.out.println(map);
//
//        while (){
//            // 相等
//            if (chars[p1] == chars[p2]){
//                p2 ++;
//                count ++;
//            }else {
//                // 不连续
//                p1 = p2;
//                count = 0;
//            }
//        }
//        System.out.println(count);

        }
    }
}
