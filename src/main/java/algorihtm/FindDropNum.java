package algorihtm;

/**
 * 找到丢失的元素
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/25 5:56 PM
 **/
public class FindDropNum {
    /**
     * 题目描述，有一个递增的有序数组，步长为1，但是其中某个元素缺失
     * input:[1,2,3,4,5,7,8]
     * output:6
     */

    public static void main(String[] args) {
        int[] testCase1 = {1,2,3,4,5,7,8};
        int[] testCase2= {1,2,3,4,5,6,7,9};
        System.out.println(findDrop(testCase2));

    }
    private static int findDrop(int[] arr){
        for (int i = 1 ; i < arr.length; i++){
            if (arr[i] - arr[i-1] > 1){
                return  arr[i] -1;
            }
        }
       return -1;
    }
}
