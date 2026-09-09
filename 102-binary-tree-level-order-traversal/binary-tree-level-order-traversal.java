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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>r=new ArrayList<>();
        if(root==null)return r;
        Deque<TreeNode>q=new ArrayDeque<>();
        q.addLast(root);
        while(!q.isEmpty()){
            int sizes=q.size();
            List<Integer>al=new ArrayList<>();
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                al.add(cn.val);
                if(cn.left!=null){
                    q.addLast(cn.left);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                }
            }
            r.add(al);
        }
        return r;
    }
}