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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(root,res,sb);
        return res;
    }
    private void helper(TreeNode node, List<String> res,StringBuilder sb) {
        if(node==null){
            return;
        }
        int len=sb.length();
        if(len>0){
            sb.append("->");
        }
        sb.append(node.val);
        if(node.left==null && node.right==null){
            res.add(sb.toString());
        }else{
            helper(node.left,res,sb);
            helper(node.right,res,sb);
        }
        sb.setLength(len);
    }
}