import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode>q1=new ArrayDeque<>();
        Deque<TreeNode>q2=new ArrayDeque<>();
        if(p==null && q==null) return true;
        if((p!=null && q==null)||(p==null && q!=null)||(p.val!=q.val)) return false;
        q1.addLast(p);
        q2.addLast(q);
        while (!q1.isEmpty() && !q2.isEmpty()){
            int sizes1=q1.size();
            int sizes2=q2.size();
            if(sizes1!=sizes2){
                return false;
            }
            for(int i=1;i<=sizes1;i++){
                TreeNode cn1=q1.pollFirst();
                TreeNode cn2=q2.pollFirst();
                if(cn1.val!=cn2.val){
                    return false;
                }
                if((cn1.left!=null && cn2.left==null) || (cn1.left==null && cn2.left!=null) ||
                (cn1.right!=null && cn2.right==null) || (cn1.right==null && cn2.right!=null)){
                    return false;
                }
                
                
                if(cn1.left!=null){
                    q1.addLast(cn1.left);
                }
                if(cn1.right!=null){
                    q1.addLast(cn1.right);
                }

                if(cn2.left!=null){
                    q2.addLast(cn2.left);
                }
                if(cn2.right!=null){
                    q2.addLast(cn2.right);
                }
            }
        }
        return true;
    }
}