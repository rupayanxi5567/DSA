import java.util.ArrayDeque;
import java.util.Deque;

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
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode>q=new ArrayDeque<>();
        q.addLast(root);
        int fv=0;
        while (!q.isEmpty()){
            int sizes=q.size();
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                if(i==1){
                    fv=cn.val;
                }
                if(cn.left!=null){
                    q.addLast(cn.left);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                }
            }
        }
    return fv;
    }
}