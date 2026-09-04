import java.util.*;

class Solution {
    public void generates(int n,int op,int c,StringBuilder sb,List<String>r){
        if(op==n && n==c){
            r.add(sb.toString());
            return;
        }
        if(op<n){
            sb.append("(");
            generates(n,op+1,c,sb,r);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(c<op){
            sb.append(")");
            generates(n,op,c+1,sb,r);
            sb.deleteCharAt(sb.length() - 1);
        }




    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        List<String>r=new ArrayList<>();
        generates(n,0,0,sb,r);
        return r;
    }
}