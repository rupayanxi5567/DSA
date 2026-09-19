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
    TreeNode prev;
    TreeNode mid;
    TreeNode last;

    TreeNode first;
    public void recoverTree(TreeNode root) {
        prev=null;
        mid=null;
        last=null;
        first=null;//new TreeNode(Integer.MIN_VALUE);
        inorders(root);
        if(first!=null && last!=null){
            int t= first.val;
            first.val= last.val;
            last.val=t;
        }else if(first!=null && mid!=null){
            int t= first.val;
            first.val= mid.val;
            mid.val=t;
        }
    }

    private void inorders(TreeNode root) {
        if(root==null){
            return;
        }
        inorders(root.left);
        //  business logic :)

        if(prev!=null && prev.val>root.val){
            if(first==null){
                first=prev;
                mid=root;
            }else{
                last=root;
            }
        }

        prev=root;
        inorders(root.right);
    }
}