
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>res=new ArrayList<>();
        Deque<TreeNode>q=new ArrayDeque<>();
        q.addLast(root);
        while(!q.isEmpty()){
            int sizes=q.size();
            long s=0;
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                s+=cn.val;
                if(cn.left!=null){
                    q.addLast(cn.left);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                }
            }
            res.add((double)s/(double)sizes);
        }
        return res;
    }
}