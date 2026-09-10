import java.util.ArrayDeque;
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
    public boolean isCousins(TreeNode root, int x, int y) {
        Deque<TreeNode>q=new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()){
            int sizes=q.size();
            boolean fx=false;
            boolean fy=false;
            int counter=1;
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                if(cn.left!=null){
                    q.addLast(cn.left);
                    if(cn.left.val==x){
                        fx=true;
                    }
                    if(cn.left.val==y){
                        fy=true;
                    }
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                    if(cn.right.val==x){
                        fx=true;
                    }
                    if(cn.right.val==y){
                        fy=true;
                    }
                }
                if( (cn.left != null && cn.right != null) && ((cn.left.val==x && cn.right.val==y) || (cn.left.val==y && cn.right.val==x))) {
                    return false;
                }
            }
            if(fx&&fy)return true;
            if(fx||fy)return false;
        }
        return false;
    }
}