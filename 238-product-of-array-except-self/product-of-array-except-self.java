class Solution {
    public int[] productExceptSelf(int[] a) {
        int n=a.length;
        int []res=new int[n];
        res[0]=1;

        for(int i=1;i<n;i++){
            res[i]=res[i-1]*a[i-1];
        }
        int rp=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*rp;
            rp=rp*a[i];
        }
        return res;
    }
}