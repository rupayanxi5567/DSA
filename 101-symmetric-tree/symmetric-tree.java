import java.util.Deque;

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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
//        if(root==null||root.left==null||root.right==null)return false;
        Deque<TreeNode> q=new LinkedList<>();
        q.addLast(root.left);
        q.addLast(root.right);
        while (!q.isEmpty()){
            TreeNode l=q.pollFirst();
            TreeNode r=q.pollFirst();

            if(l==null && r==null){
                continue;
            }

            if(l==null || r==null || l.val!=r.val){
                return false;
            }

            q.addLast(l.left);
            q.addLast(r.right);
            q.addLast(l.right);
            q.addLast(r.left);
        }
        return true;
    }
}