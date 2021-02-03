package algorihtm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductSubarryTest {

    @Test
    void should_return_6_of_testcase_1() {
        int[] arr = {2, 3, -2, 5};

        MaxProductSubarry maxProductSubarry = new MaxProductSubarry();
        int maxNum = maxProductSubarry.check(arr);
        assertEquals(6, maxNum);
    }

    void should_return_0_of_testcase_1() {
        int[] arr = {-2,0,-1};

        MaxProductSubarry maxProductSubarry = new MaxProductSubarry();
        int maxNum = maxProductSubarry.check(arr);
        assertEquals(0, maxNum);
    }

}