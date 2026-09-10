import java.util.*;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        if(root==null)return res;
        Deque<TreeNode>q=new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()){
            int sizes=q.size();
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                if(cn.left!=null){
                    q.addLast(cn.left);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                }
                if(i==sizes){
                    res.add(cn.val);
                }
            }
        }
        return res;
    }
}