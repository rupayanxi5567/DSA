import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Deque<TreeNode>q=new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()){
            int sizes=q.size();
            int mx=Integer.MIN_VALUE;
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                mx=Math.max(mx,cn.val);
                if(cn.left!=null){
                    q.addLast(cn.left);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                }
            }
            res.add(mx);
        }
        return res;
    }
}