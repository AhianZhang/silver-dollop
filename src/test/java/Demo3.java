import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/2/6 12:04 AM
 **/
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(2 & 2);
        System.out.println(2 ^ 2);
        System.out.println(3 ^ 3);
        System.out.println(3|3);
        Set<Integer> set = new HashSet<>();
        set.stream().reduce(0, Integer::sum);
        Map<Integer, Integer> map = new HashMap<>();
        int ans =0;
        for (Map.Entry<Integer,Integer> entrie: map.entrySet()){
            if (entrie.getValue() == 1){
                ans+= entrie.getKey();
            }
        }
    }
}
