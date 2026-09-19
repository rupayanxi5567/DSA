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
    int ind=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int ub=Integer.MAX_VALUE;
        return helper(preorder,ub);
    }

    private TreeNode helper(int[] preorder, int ub) {
        if(ind==preorder.length || ub<preorder[ind]){
            return null;
        }
        TreeNode node=new TreeNode(preorder[ind++]);
        node.left=helper(preorder,node.val);
        node.right=helper(preorder, ub);
        return node;
    }
}