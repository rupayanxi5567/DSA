class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int n=a.length,s=0,min = Integer.MAX_VALUE;
        int l=0,r=0;

        while(r<n){
            s=s+a[r];
            while(s>=t){
                int range=r-l+1;
                min=Math.min(min,range);
                s=s-a[l];
                l++;
            }
            r++;
        }
return min == Integer.MAX_VALUE ? 0 : min;    }
}