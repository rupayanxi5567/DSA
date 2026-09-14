import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public TreeNode buildTree(int[] p, int[] in) {
        if (p.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode roots=new TreeNode(p[0]);
        int index=0;
        int rootVal= roots.val;
        for(int i=0;i<in.length;i++){
            if(in[i]==rootVal){
                index=i;
                break;
            }
        }
        roots.left=buildTree(Arrays.copyOfRange(p,1,index+1),Arrays.copyOfRange(in,0,index));
        roots.right=buildTree(Arrays.copyOfRange(p,index+1,p.length),Arrays.copyOfRange(in,index+1,in.length));

        return roots;
    }


}