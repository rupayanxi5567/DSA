class Solution {
    public int[] pivotArray(int[] a, int p) {
        int n=a.length;
        int res[]=new int [n];
        int l=0,r=n-1;

        for(int i=0,j=n-1;i<n;i++,j--){
            if(p>a[i]){
                res[l++]=a[i];
            }
            if(p<a[j]){
                res[r--]=a[j];
            }
        }
        while(l<=r){
            res[l++]=p;
        }
        return res;
    }
}