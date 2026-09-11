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
    private TreeNode helper(int[] a, int l, int r) {
        if(l>r){
            return null;
        }
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(a[mid]);
        root.left=helper(a,l,mid-1);
        root.right=helper(a,mid+1,r);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] a) {
        return helper(a,0,a.length-1);
    }


}