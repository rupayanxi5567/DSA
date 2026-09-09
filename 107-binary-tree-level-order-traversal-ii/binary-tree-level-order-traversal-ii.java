import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode>q=new ArrayDeque<>();
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        q.addLast(root);
        while (!q.isEmpty()){
            int sizes=q.size();
            List<Integer>al=new ArrayList<>();
            for(int i=1;i<=sizes;i++){
                TreeNode cn=q.pollFirst();
                if(cn.left!=null){
                    q.addLast(cn.left);
                }
                if(cn.right!=null){
                    q.addLast(cn.right);
                }
                al.add(cn.val);
            }
            res.add(al);
        }
        Collections.reverse(res);
        return res;
    }
}