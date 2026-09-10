/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        Deque<Node>q=new ArrayDeque<>();
        q.addLast(root);

        while (!q.isEmpty()){
            int sizes=q.size();
            List<Integer>al=new ArrayList<>();
            for(int i=1;i<=sizes;i++){
                Node cn=q.pollFirst();;;;;;;
                al.add(cn.val);
                for(Node x:cn.children){
                    q.addLast(x);
                }
            }
            res.add(al);
        }
        return res;
    }
}