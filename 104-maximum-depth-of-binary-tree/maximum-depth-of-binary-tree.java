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
    public int maxDepth(TreeNode root) {
        Deque<TreeNode>q=new ArrayDeque<>();
        int count=0;
        if(root==null){
            return count;
        }
        q.addLast(root);
        while (!q.isEmpty()){
            count++;
            int sizes=q.size();
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                if(cn.left!=null){
                    q.addLast(cn.left);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                }
            }
        }
        return count;
    }
}