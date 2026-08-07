class Solution {
    public int maxProfit(int[] a) {
        int p=0,l=0,n=a.length;
        for(int r=1;r<n;r++){
            if(a[r]>a[l]){
                int diff=a[r]-a[l];
                p=p+diff;
            }
            l++;
        }
        return p;
    }
}