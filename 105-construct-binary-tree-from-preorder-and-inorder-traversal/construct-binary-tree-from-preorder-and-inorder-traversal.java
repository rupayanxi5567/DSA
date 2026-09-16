import java.util.*;
import java.util.Map;

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
    Map<Integer,Integer> inMap=new HashMap<>();
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i );
        }
        return constructs(preorder,0,preorder.length-1);
    }

    private TreeNode constructs(int[] preorder, int starts, int ends) {
        if(starts>ends){
            return null;
        }
        int rootNodeVal=preorder[preIndex++];
        TreeNode rootNode=new TreeNode(rootNodeVal);

        int inorderIndex=inMap.get(rootNodeVal);

        rootNode.left=constructs(preorder,starts,inorderIndex-1);
        rootNode.right=constructs(preorder,inorderIndex+1,ends);
        return rootNode;
    }
}