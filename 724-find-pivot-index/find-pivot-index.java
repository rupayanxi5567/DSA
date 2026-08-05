class Solution {
    public int pivotIndex(int[] a) {
        int l=0,r=0,s=0;
        int n=a.length;

        for(int i=0;i<n;i++){
            s=s+a[i];
        }

        for(int i=0;i<n;i++){
            r=s-l-a[i];
            if(l==r){
                return i;
            }
            l=l+a[i];

        }
        return -1;
    }
}