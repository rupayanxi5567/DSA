class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int n=a.length,s=0,min = Integer.MAX_VALUE;
        int l=0,r=0;

        if(n==1 && a[0]>=t) return 1;
        if(n==1 && a[0]<t) return 0;

        

        while(l<=r && r<n){
            if(l==r){
                s=a[l];
            }else if(l+1==r){
                s=a[l]+a[r];
            }else{
                s=s+a[r];
            }

            if(s<t){
                r++;
            }else{
                int range=r-l+1;
                if(min>range){
                    min=range;
                }
                // s=s-a[l]-a[r];
                s=s-a[l]-a[r];
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;        
    }
}