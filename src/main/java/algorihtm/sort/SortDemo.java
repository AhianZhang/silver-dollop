package algorihtm.sort;

import java.util.Arrays;

/**
 * 空间复杂度 n^2 时间复杂度 1
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/14 2:32 PM
 **/
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,34,2,5,6,8,3,1,22,5,66,1,63,15};
        Arrays.stream(bubbleSort(arr)).forEach(System.out::println);
    }


    private static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++){
            for (int j = 0; j < arr.length -1 - i;j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    
}
