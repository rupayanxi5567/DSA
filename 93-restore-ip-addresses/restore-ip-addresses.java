import java.util.*;

class Solution {
    public void restores(int j,String s,List<String>r,StringBuilder sb,int n,List<String>p){
        if(p.size()==4){
            if(j==n){
                r.add(String.join(".",p));
            }
            return;
        }
        for(int i=j;i<Math.min(n,j+3);i++){
            String seg=s.substring(j,i+1);
            if(seg.length()>1 && seg.startsWith("0"))break;
            if(Integer.parseInt(seg)>255)break;
            p.add(seg);
            restores(i+1,s,r,sb,n,p);
            p.removeLast();
        }
    }
    public List<String> restoreIpAddresses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        List<String>r=new ArrayList<>();
        List<String>p=new ArrayList<>();
        restores(0,s,r,sb,n,p);
        return r;
    }
}