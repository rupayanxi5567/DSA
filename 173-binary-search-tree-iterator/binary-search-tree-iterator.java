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
class BSTIterator {

    Deque<TreeNode>stk=new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    public int next() {
        TreeNode tep=stk.pop();
        pushAll(tep.right);
        return tep.val;
    }

    private void pushAll(TreeNode node) {
        for (;node!=null;){
            stk.push(node);node=node.left;
        }
    }

    public boolean hasNext() {
        return !stk.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */