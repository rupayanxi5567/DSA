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
    public TreeNode insertIntoBST(TreeNode root, int x) {
        if(root==null){
            return new TreeNode(x);
        }
        TreeNode c=root;
        while(c!=null){
            if(c.val>x && c.left==null){
                c.left=new TreeNode(x);
                break;
            }else if(c.val<x && c.right==null){
                c.right=new TreeNode(x);
                break;
            }else if(c.val>x){
                c=c.left;
            }else if(c.val<x){
                c=c.right;
            }
        }
        return root;
    }
}