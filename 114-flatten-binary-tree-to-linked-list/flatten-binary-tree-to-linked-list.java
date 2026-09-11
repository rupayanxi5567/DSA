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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode cn=root;
        while (cn!=null){
            if(cn.left!=null){
                TreeNode tep=cn.left;
                while (tep.right!=null){
                    tep=tep.right;
                }
                tep.right=cn.right;
                cn.right=cn.left;
                cn.left=null;
            }
            cn=cn.right;
        }
    }
}