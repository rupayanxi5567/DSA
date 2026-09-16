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
    public int countNodes(TreeNode root) {
        int counter=0;
        if(root==null){
            return counter;
        }
        int lefts=getLeftHeight(root);
        int rights=getRightsHeight(root);
        if(lefts==rights){
            return (1<<rights)-1;
        }
        return 1+countNodes (root.left) +countNodes (root.right);
    }

    private int getLeftHeight(TreeNode node) {
        int h=0;
        while(node!=null){
            node=node.left;
            h++;
        }
        return h;
    }
    private int getRightsHeight(TreeNode node) {
        int h=0;
        while(node!=null){
            node=node.right;
            h++;
        }
        return h;
    }
}