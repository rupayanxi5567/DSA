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
    int mx=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return mx;
    }

    private int helper(TreeNode node) {
        
        if(node==null){
            return 0;
        }
        
        int lg=Math.max(0,helper(node.left));
        int rg=Math.max(0,helper(node.right));

        int cpS=node.val+lg+rg;
        mx=Math.max(mx,cpS);

        return node.val+Math.max(lg,rg);
    }
}