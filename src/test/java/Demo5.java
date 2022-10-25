import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/2/6 10:53 AM
 **/
public class Demo5 {
    public static void main(String[] args) {
//        System.out.println(gcd(4, 8));
        HashMap<String, String> hashMap = new HashMap<String, String>();

       for (Map.Entry<String, String> entry: hashMap.entrySet()){
//           if (entry.getValue())
        }
        /**
         * 1, 10, 4, 2
         * 9,  3, 8, 7
         * 15,16,17,12
         */
        int[][] matrix = new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}};

       int[][] dirs = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};// up right down left
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < dirs.length; k++) {
                    int x = i + dirs[k][0];
                    int y = j + dirs[k][1];
                    if(x < 0 || y < 0 || x > matrix.length -1 || y > matrix[0].length -1) continue;
                    System.out.println("i="+i + " j="+j);
                    System.out.println("x="+x +" y="+y);
                    String s = k == 0?"up ":k==1?"right ":k==2?"down ":k==3?"left ":"";
                    System.out.println("current: "+matrix[i][j]);
                    System.out.println("after move " + s + ": " +matrix[x][y]);
                }
            }
        }

    }
     static int gcd(int a, int b) { // 欧几里得算法
        return b == 0 ? a : gcd(b, a % b);
    }
    public  static long smallestNumber(long num) {
        String str = String.valueOf(num);
        String s = "";
        char[] chars = str.toCharArray();
        int[] arr = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            arr[i] = chars[i] - '0';
        }
        Arrays.sort(arr);
        if (!str.contains("-")){

            int idx = 0;

            while (arr[idx] == 0){
                idx++;
            }
            s +=arr[idx];
            for (int i = 0; i < str.length()  ; i++) {
                if (i != idx){
                    s += arr[i];
                }
            }
        }else {
            s += "-";
            for (int i = str.length() -1; i > 0; i--) {
               s += arr[i];
            }

        }



        return  Long.valueOf(s);
    }
}
