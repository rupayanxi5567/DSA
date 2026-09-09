class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        boolean flag=false;
        Deque<TreeNode>q=new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()){
            int sizes=q.size();
            List<Integer>al=new ArrayList<>();
            for(int i=1;i<=sizes;i++){
                if(flag){
                    TreeNode cn=q.pollLast();
                    al.add(cn.val);
                    if(cn.right!=null){
                        q.addFirst(cn.right);
                    }
                    if(cn.left!=null){
                        q.addFirst(cn.left);
                    }
                }else{
                    TreeNode cn=q.pollFirst();
                    al.add(cn.val);
                    if(cn.left!=null){
                        q.addLast(cn.left);
                    }
                    if(cn.right!=null){
                        q.addLast(cn.right);
                    }
                }
            }
            res.add(al);
            flag=!flag;
        }
        return res;
    }
}