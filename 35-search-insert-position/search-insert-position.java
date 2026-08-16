class Solution {
    public int searchInsert(int[] a, int x) {
        int n=a.length;
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(x==a[m]){
                return m;
            }else if(x<a[m]){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return r+1;
    }
}