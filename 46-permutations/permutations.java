class Solution {
    public void swaps(int i,int j, int[] a){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public void x(int j,List<List<Integer>>r,int n,int []a ){
        if(j==n){
            List<Integer>al=new ArrayList<>();
            for(int x:a){
                al.add(x);
            }
            r.add(new ArrayList<>(al));
            return;
        }
        for(int i=j;i<n;i++){
            swaps(i,j,a);
            x(j+1,r,n,a);
            swaps(i,j,a);
        }
    }
    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>>r=new ArrayList<>();
        int n=a.length;
        x(0,r,n,a);
        return r;
    }
}