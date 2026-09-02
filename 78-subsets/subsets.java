import java.util.*;

class Solution {
    public static void prints(int i,ArrayList<Integer>r,int s,int []a,int n,List<List<Integer>> al){
        if(n==i){
            al.add(new ArrayList<>(r));
            return;
        }
        r.add(a[i]);
        prints(i+1,r,s+a[i],a,n,al);
        r.remove(r.size()-1);
        prints(i+1,r,s,a,n,al);
    }
    public List<List<Integer>> subsets(int[] a) {
        ArrayList<Integer>r=new ArrayList<>();
        List<List<Integer>> al = new ArrayList<>();
        int n=a.length;
        prints(0,r,0,a,n,al);
        return al;
    }
}