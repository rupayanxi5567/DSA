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
    int cout=0;
    int res=0;
    private void finder(TreeNode node, int k) {
        if(node==null||cout>=k){
            return;
        }
        finder(node.left,k);
        cout++;
        if(cout==k){
            res=node.val;
            return;
        }
        finder(node.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        finder(root,k);
        return res;
    }


}