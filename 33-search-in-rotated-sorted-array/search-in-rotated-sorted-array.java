class Solution {
    public int search(int[] a, int x) {
        int n=a.length;
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(x==a[m])return m;
            else if(a[l]<=a[m]){
                if(a[l]<=x && x<a[m]){
                    r=m-1;
                }else{
                    l=m+1;
                }
            }else{
                if(x>a[m] && x<=a[r]){
                    l=m+1;
                }else{
                    r=m-1;
                }
            }
        }
        return -1;
    }
}