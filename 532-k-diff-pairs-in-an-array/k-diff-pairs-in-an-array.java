class Solution {
    public int findPairs(int[] a, int k) {
        int n=a.length;
        Arrays.sort(a);
        int l=0,r=1,c=0;
        
        while(r<n){
            int d=a[r]-a[l];
            if(r==l){
                r++;
            }else if(d<k){
                r++;
            }else if(d==k){
                c++;
                r++;
                l++;
                while(l<=r && l<n  && a[l]==a[l-1]) l++;
                while(r<n && a[r]==a[r-1])  r++;
            }else if(d>k){
                l++;
            }
        }
        return c;
    }
}