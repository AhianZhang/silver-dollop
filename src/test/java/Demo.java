
import java.util.*;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/1/16 11:12 AM
 **/
public class Demo {
    public static void main(String[] args) {
//        Queue<Integer> que = new ArrayDeque<>();
//        int[] arr = {1,2,3};
//        Map<Integer, List<Integer>> idxSameVal = new HashMap<>();
//        for(int i = 0; i < 10; i++){
//            idxSameVal.putIfAbsent(arr[i],new ArrayList<Integer>());
//            idxSameVal.get(arr[i]).add(i);
//
//        }
        String s = "abc";
//        System.out.println("a-b-c".split("-").length > 2);
//
//        int[][] arr = new int[][]{{1, 2}, {9, 8}, {2, 4}, {3, 6}};
//        Stack<Integer> stack = new Stack<>();
//        int cnt = 0;
//        Arrays.sort(arr, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o2[1]);

//        int[] arr = {0,0,1,0};
//        int[] arr = {1, 1};
//        List<Integer> integers = maxScoreIndices(arr);
//        System.out.println(integers);
        int lower = 0;
        lower |= 1 << ('B' - 'a');
        System.out.println(lower);
        System.out.println('B' - 'A');
        System.out.println('c' - 'a');
        System.out.println('b');

        String a = "abc";
        char[] chars = a.toCharArray();

        System.out.println(a.indexOf('d'));


//        System.out.println(fibonacci(500000000));
    }

    //    public static int fibonacci(int n){
//        if(n <= 1) return n;
//        return fibonacci(n- 1) + fibonacci(n - 2);
//    }
    public static int fibonacci(int n) {
        int[] f = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);
//        System.out.println(list);
//        Collections.sort(list,(o1, o2) -> o2 - o1);

//        System.out.println(list);
       Map<String, String> map = new TreeMap<String, String>();
        ArrayDeque<Object> objects1 = new ArrayDeque<>();
        PriorityQueue<Integer> q=new PriorityQueue<>();

        for (i = 2; i <= n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    public String reversePrefix(String word, char ch) {

//        if(!word.contains(ch)) return word;
        int pos = word.indexOf(ch);
        int i = 0, j = Integer.MAX_VALUE;
        while (i < j) {
//            Charactor tmp = word.charAt(i);
//            word.charAt(i) = word.charAt(j);
//            word.charAt(j) = tmp;
            i++;
            j--;
        }
        return word;
    }

    public static List<Integer> maxScoreIndices(int[] nums) {

        Map<Integer, List<Integer>> tmp = new TreeMap<>((o1, o2) -> o2 - o1);
        List<Integer> list = new ArrayList<>();
        List<Integer> lList = new ArrayList<>();
        List<Integer> rList = new ArrayList<>();
        int fl = 0;
        int fr = 0;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            if (nums[i] == 0) {
                fl++;
            } else {
                fr++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            lList = list.subList(0, i);
            rList = list.subList(i + 1, nums.length);

            int la = lList.stream().filter(e -> e == 0).reduce(0, (a, b) -> a + b).intValue();
            int ra = rList.stream().filter(e -> e == 0).reduce(0, (a, b) -> a + b).intValue();
            int cnt = la + ra;
            tmp.put(cnt, tmp.getOrDefault(cnt, new ArrayList<>()));
            tmp.get(cnt).add(i);
        }


        if (fl < fr) {
            tmp.put(fl, tmp.getOrDefault(fl, new ArrayList<>()));
            tmp.get(fl).add(0);
            String s = "";


        } else {
            tmp.put(fr, tmp.getOrDefault(fr, new ArrayList<>()));
            tmp.get(fr).add(nums.length - 1);
        }


        return tmp.values().stream().findFirst().get();
    }
}

