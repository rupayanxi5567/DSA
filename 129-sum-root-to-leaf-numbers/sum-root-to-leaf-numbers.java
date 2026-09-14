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
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }

    private int helper(TreeNode node, int sum) {
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
            sum=sum*10+ node.val;
            return sum;
        }

        int lefts=helper(node.left,sum*10+ node.val);
        int rights=helper(node.right,sum*10+ node.val);

        return lefts+rights;
    }
}