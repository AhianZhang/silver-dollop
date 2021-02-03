package algorihtm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SingleNumberTest {

    @Test
    void should_return_2() {
        SingleNumber singleNumber = new SingleNumber();

        int nums[] = {1,1,2};
        int check = singleNumber.check(nums);
        assertEquals(2,check);
    }

    @Test
    void should_return_3_when_get_array() {
        SingleNumber singleNumber = new SingleNumber();
        int num[] = {1,3,2,4,1,2,4};
        assertEquals(3,singleNumber.check(num));
    }
}