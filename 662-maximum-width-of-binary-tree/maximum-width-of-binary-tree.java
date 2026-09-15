import java.util.Deque;
import java.util.LinkedList;

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
    class Pair{
        TreeNode node;
        int ind;
        public Pair(TreeNode node,int ind){
            this.node=node;
            this.ind=ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int width=0;
        if(root==null){
            return width;
        }
        Deque<Pair>q=new LinkedList<>();
        q.addLast(new Pair(root,0));
        while (!q.isEmpty()){

            int sizes=q.size();
            int start=0,end=0;
            int minIndex=q.peekFirst().ind;

            for(int i=1;i<=sizes;i++){
                Pair cp=q.pollFirst();

                TreeNode cn=cp.node;
                int curInd=cp.ind-minIndex;

                if(i==1){
                    start=cp.ind;
                }
                if(i==sizes){
                    end=cp.ind;
                }
                if(cn.left!=null){
                    q.addLast(new Pair(cn.left,2*curInd+1));
                }
                if(cn.right!=null){
                    q.addLast(new Pair(cn.right,2*curInd+2));
                }

            }
            width=Math.max(width,end-start+1);
        }
        return width;
    }
}