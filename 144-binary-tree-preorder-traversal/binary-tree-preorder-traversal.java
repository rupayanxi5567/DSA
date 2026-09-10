import java.util.ArrayList;
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
    public void helper(TreeNode node,List<Integer>res){
        if(node==null){
            return;
        }
        res.add(node.val);
        helper(node.left,res);
        helper(node.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        if(root==null){
            return res;
        }

        helper(root,res);

        return res;
    }
}