import java.util.*;

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
    public int amountOfTime(TreeNode root, int start) {
        int minutes=-1;
        Deque<TreeNode> q=new ArrayDeque<>();
        Map<TreeNode,TreeNode>h=new HashMap<>();
        Set<TreeNode>s=new HashSet<>();
        List<Integer>res=new ArrayList<>();
        q.addLast(root);
        TreeNode sn=null;
        while (!q.isEmpty()){
            int sizes=q.size();
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                if(cn.val==start){
                    sn=cn;
                }
                if(cn.left!=null){
                    q.addLast(cn.left);
                    h.put(cn.left,cn);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                    h.put(cn.right,cn);
                }

            }
        }

        q.addLast(sn);
        s.add(sn);
        while (!q.isEmpty()){
            int sizes=q.size();
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                if(cn.left!=null && !s.contains(cn.left)){
                    s.add(cn.left);
                    q.addLast(cn.left);
                }
                if(cn.right!=null && !s.contains(cn.right)){
                    s.add(cn.right);
                    q.addLast(cn.right);
                }

                TreeNode parents=h.get(cn);
                if(parents!=null && !s.contains(parents)){
                    s.add(parents);
                    q.addLast(parents);
                }
            }
            minutes++;
        }
        return minutes;
    }
}