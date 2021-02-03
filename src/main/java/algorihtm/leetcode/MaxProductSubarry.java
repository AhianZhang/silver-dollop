package algorihtm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/5/18 9:27 AM
 **/
public class MaxProductSubarry {
    public int check(int[] arr) {
        if (arr.length == 1){
            return arr[0];
        }
        List resultList = new ArrayList(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {

            resultList.add(arr[i]*arr[i+1]);
        }
        return (int) Collections.max(resultList);
    }
    /*
    I: [2,3,-2,4]
    O: 6

    [2,3]
     */


}
