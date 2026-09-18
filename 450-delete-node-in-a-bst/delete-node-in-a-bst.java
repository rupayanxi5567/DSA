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
    public TreeNode findLargestInLeft(TreeNode node){
        if(node.right==null){
            return node;
        }
        return findLargestInLeft(node.right);
    }
    public TreeNode helper (TreeNode node){
        if(node.left==null)return node.right;
        if(node.right==null)return node.left;
        TreeNode rc=node.right;
        TreeNode largest_in_left_tree=findLargestInLeft(node.left);
        largest_in_left_tree.right=rc;
        return node.left;
    }
    public TreeNode deleteNode(TreeNode root, int x) {
        if(root==null){
            return null;
        }
        if(root.val==x){
            return helper(root);
        }
        TreeNode c=root;
        while(c!=null){
            if(c.val>x){ // go to left
                if(c.left!=null && c.left.val==x){
                    c.left=helper(c.left);
                    break;
                }else{
                    c=c.left;
                }
            }else{   // go to right
                if(c.right!=null && c.right.val==x){
                    c.right=helper(c.right);
                    break;
                }else{
                    c=c.right;
                }
            }
        }
        return root;
    }
}