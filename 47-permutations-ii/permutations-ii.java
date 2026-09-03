class Solution {
    public boolean ss(int st,int end,int[] a){
        for(int i=st;i<end;i++){
            if(a[i]==a[end])return false;
        }
        return true;
    }
    public void swaps(int i,int j, int[] a){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public void prints(int j,List<List<Integer>>r,int []a,int n){
        if(j==n){
            List<Integer>al=new ArrayList<>();
            for(int x:a){
                al.add(x);
            }
            r.add(new ArrayList<>(al));
            return;
        }
        for(int i=j;i<n;i++){
            if(!ss(j,i,a))continue;
            swaps(i,j,a);
            prints(j+1,r,a,n);
            swaps(i,j,a);
        }
    }
    public List<List<Integer>> permuteUnique(int[] a) {
        List<List<Integer>>r=new ArrayList<>();
        int n=a.length;
        prints(0,r,a,n);
        return r;
    }
}