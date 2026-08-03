class Solution {
    public double findMaxAverage(int[] a, int k) {
        int n=a.length,s=0;
        double mx=Integer.MIN_VALUE,avg;
        int l=0,r=k-1;
        for(int i=0;i<k;i++){
            s=s+a[i];
        }
        avg=(double)s/k;
        mx=Math.max(mx,avg);
        l++;r++;
        while(r<n){
            s=s-a[l-1]+a[r];
            avg=(double)s/k;
            mx=Math.max(mx,avg);
            l++;r++;
        }
        return mx;
    }
}