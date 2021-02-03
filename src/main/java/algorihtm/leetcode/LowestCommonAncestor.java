//package algorihtm.leetcode;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author ahianzhang
// * @version 1.0
// * @date 2020/10/13 2:56 PM
// **/
//public class LowestCommonAncestor {
//
//    List<Integer> list = new ArrayList<>();
//    public  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//    findRoot(root);
//
//    return null;
//    }
//
//    private void findRoot(TreeNode root){
//        if(root == null){
//            return;
//        }
//        list.add(root.val);
//        findRoot(root.left);
//        findRoot(root.right);
//    }
//
//    public static void main(String[] args) {
//        LowestCommonAncestor ancestor = new LowestCommonAncestor();
//        ancestor.lowestCommonAncestor()
//    }
//}
