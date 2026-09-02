class Solution {
    public static void prints(int j,List<Integer>al, int[] a,List<List<Integer>>r,int n){
        r.add(new ArrayList<>(al));
        for(int i=j;i<n;i++){
            if(i>j && a[i]==a[i-1])continue;
            al.add(a[i]);
            prints(i+1,al,a,r,n);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] a) {
        List<Integer>al=new ArrayList<>();
        List<List<Integer>>r=new ArrayList<>();;
        int n=a.length;
        Arrays.sort(a);
        prints(0,al,a,r,n);
        return r;
    }
}