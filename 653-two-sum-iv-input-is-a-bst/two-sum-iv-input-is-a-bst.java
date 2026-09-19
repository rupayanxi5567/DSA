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

class BSTiterator{
    Deque<TreeNode>stk=new ArrayDeque<>();
    boolean isReverse;
    public BSTiterator(TreeNode root,boolean isReverse){
        this.isReverse=isReverse;
        pushAll(root);
    }

    public int next(){
        TreeNode tep=stk.pop();
        if(!isReverse){
            pushAll(tep.right);
        }else{
            pushAll(tep.left);
        }
        return tep.val;
    }

    private void pushAll(TreeNode root) {
        while (root!=null){
            stk.push(root);
            root=!isReverse?root.left:root.right;
        }
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        BSTiterator l = new BSTiterator(root,false);
        BSTiterator r = new BSTiterator(root,true);
        int i=l.next();
        int j=r.next();
        while (i<j){
            if(i+j==k){
                return true;
            }else if(i+j<k){
                i= l.next();
            }else{
                j=r.next();
            }
        }
        return false;
    }
}