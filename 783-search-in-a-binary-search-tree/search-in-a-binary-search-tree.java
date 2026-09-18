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
    public TreeNode searchBST(TreeNode root, int x) {
        if(root==null){
            return null;
        }
        TreeNode c=root;
        while(c!=null){
            if(c.val==x){
                return c;
            }else if(c.val>x){
                c=c.left;
            }else{
                c=c.right;
            }
        }
        return null;
    }
}