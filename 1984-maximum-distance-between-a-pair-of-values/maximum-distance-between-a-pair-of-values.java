class Solution {
    public int maxDistance(int[] a, int[] b) {
        int m=a.length,n=b.length,mx=0,i=0,j=0;
        while(i<m && j<n){
            while(j<i) j++;
            if(j<n && b[j]>=a[i]){
                int d=j-i;
                mx=Math.max(mx,d);
                j++;
            }else{
                i++;
            }
        }
        return mx;
    }
}