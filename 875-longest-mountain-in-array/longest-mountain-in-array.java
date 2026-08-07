class Solution {
    public int longestMountain(int[] a) {
        int mx_len=0;
        int l=1,r=0;
        int n=a.length;
        for(int i=1;i<n-1;i++){
            if(a[i]>a[i+1] && a[i]>a[i-1]){
                l=i-1;
                r=i+1;

                while(l>=1 && a[l]>a[l-1]){
                    l--;
                }

                while(r<n-1 && a[r]>a[r+1]){
                    r++;
                }
            }
            
            if(l>=0 && r<n){
                int len=r-l+1;
                mx_len=Math.max(len,mx_len);
            }
        }
        return mx_len;
    }
}