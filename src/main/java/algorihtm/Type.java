package algorihtm;

import java.util.Arrays;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/27 4:57 PM
 **/
public class Type {
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeString() {
        switch (type) {
            case 0:
                return "ZERO";
            case 1:
                return "ONE";
            default:
                return "OTHER";
        }
    }
    public static void main(String[] args) {
//        Type type = new Type();
//        type.getTypeString();
        int[][] arr = {{1,2},{3,4},{5,6}};
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//      Arrays.stream(arr[0]).forEach(System.out::println);
        System.out.println(arr[0][1]);
//      Arrays.stream(arr[0]).forEach(System.out::println);
    }
}
