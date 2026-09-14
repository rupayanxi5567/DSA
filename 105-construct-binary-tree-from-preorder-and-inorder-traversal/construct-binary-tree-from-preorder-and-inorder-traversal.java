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
    int preIndex=0;
    Map<Integer,Integer>inMap=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        return builds(preorder,0,inorder.length-1);
    }

    private TreeNode builds(int[] preorder, int inS, int inE) {
        if(inS>inE){
            return null;
        }

        int rootVal=preorder[preIndex++];
        TreeNode roots=new TreeNode(rootVal);

        int inIndex=inMap.get(rootVal);

        roots.left=builds(preorder,inS,inIndex-1);
        roots.right=builds(preorder,inIndex+1,inE);

        return roots;

    }
}