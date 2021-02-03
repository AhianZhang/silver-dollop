package algorihtm.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-10 10:23
 *
 * 2D array [height,sum]
 * the sum is the number of people in front of this person who have a height greater than or equal to h
 * boundary: people < 1,100
 *
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 *
 *
 *
 * solution:
 * using map
 *
 * key: height
 * value: sum like index can make the sequence
 *
 *
 *
 *
 *
 **/
public class ReconstructQueue_406 {

    public int[][] reconstructQueue(int[][] people) {


        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
            }
        });
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1],cur);
        }
        return res.toArray(new int[people.length][]);
    }

    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};

        ReconstructQueue_406 rq = new ReconstructQueue_406();
        System.out.println(Arrays.deepToString(rq.reconstructQueue(people)));
    }
}
