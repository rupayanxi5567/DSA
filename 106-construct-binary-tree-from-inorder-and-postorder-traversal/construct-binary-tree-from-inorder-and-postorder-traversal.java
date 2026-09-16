import java.util.HashMap;
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
    Map<Integer,Integer>inMap=new HashMap<>();
    int postInd=0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postInd=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        return constructs(postorder,0,postorder.length-1);
    }

    private TreeNode constructs(int[] postorder, int starts, int ends) {
        if(starts>ends){
            return null;
        }
        int rootNodeVal=postorder[postInd--];
        TreeNode rootNode=new TreeNode(rootNodeVal);

        int inorderIndex=inMap.get(rootNodeVal);

        rootNode.right=constructs(postorder,inorderIndex+1,ends);
        rootNode.left=constructs(postorder,starts,inorderIndex-1);
        return rootNode;
    }
}