import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/2/6 10:37 AM
 **/
public class Demo4 {
    public static void main(String[] args) {
        System.out.println(sortEvenOdd(new int[]{4,1,2,3}));
    }
    public  static int[] sortEvenOdd(int[] nums) {
        if (nums.length < 3) return nums;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                even.add(nums[i] );
            }else {
                odd.add(nums[i] );
            }
        }

        odd.sort((o1, o2) -> o2 -o1);
        even.sort((o1, o2) -> o1 -o2);

        int[] arr = new int[nums.length];
        int evenIdx = 0;
        int oddIdx = 0;
        for (int j = 0; j < arr.length; j++){
          if (j % 2 == 0 && evenIdx < even.size()){
              arr[j] = even.get(evenIdx);
              evenIdx++;
          }else if(j % 2 != 0 && oddIdx< odd.size()){
              arr[j] = odd.get(oddIdx);
              oddIdx++;
          }

        }

        return  arr;
    }
}
