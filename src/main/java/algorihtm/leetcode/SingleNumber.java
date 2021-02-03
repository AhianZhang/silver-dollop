package algorihtm.leetcode;

import java.util.Stack;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/5/14 4:24 PM
 **/
public class SingleNumber {


    public int check(int[] nums) {


        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp ^=nums[i];
        }
        return tmp;
    }

    }
