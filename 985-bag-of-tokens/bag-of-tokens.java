class Solution {
    public int bagOfTokensScore(int[] a, int p) {
        Arrays.sort(a);
        int n=a.length,s=0;
        int mx=0,l=0,r=n-1;
        if(n>0 && a[0]>p) return 0;
        while(l<=r){
            if(p>=a[l]){
                p=p-a[l];
                s++;
                l++;
                mx=Math.max(mx,s);
            }else {
                p=p+a[r];
                s--;
                r--;
            }
        }
        return mx;
    }
}