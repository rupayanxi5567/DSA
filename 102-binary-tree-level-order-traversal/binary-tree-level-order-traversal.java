class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>r=new ArrayList<>();
        if(root==null){
            return r;
        }
        Deque<TreeNode> q=new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()){
            int sizeOfLevel=q.size();
            List<Integer>al=new ArrayList<>();
            for(int i=0;i<sizeOfLevel;i++){
                TreeNode currNode=q.pollFirst();
                al.add(currNode.val);
                if(currNode.left!=null){
                    q.addLast(currNode.left);
                }
                if(currNode.right!=null){
                    q.addLast(currNode.right);
                }
            }
            r.add(al);
        }
        return r;
    }


}