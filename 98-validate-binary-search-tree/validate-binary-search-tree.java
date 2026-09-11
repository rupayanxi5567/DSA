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
    private boolean helper(TreeNode node, Integer l, Integer h) {
        if(node==null){
            return true;
        }
        if(l!=null && node.val<=l){
            return false;
        }
        if(h!=null && node.val>=h){
            return false;
        }

        boolean lefts=helper(node.left,l, node.val);
        boolean rights=helper(node.right, node.val,h);

        return lefts && rights;
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }


}