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
    int diameter=0;
    public int heights(TreeNode node){
        if(node==null){
            return 0;
        }
        int l=heights(node.left);
        int r=heights(node.right);
        int dia=l+r+1;
        diameter=Math.max(dia,diameter);
        return Math.max(l,r)+1;

    }

    public int diameterOfBinaryTree(TreeNode root) {
        heights(root);
        return diameter-1;
    }
}