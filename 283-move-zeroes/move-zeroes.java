class Solution {
    public void moveZeroes(int[] a) {
        int l=0,r=0,n=a.length;
        while(l<=r && r<n){
            if(a[l]!=0){
                l++;
                r++;
            }else if(a[r]==0){
                r++;
            }
            else if(a[r]!=0 && a[l]==0){
                int tep=a[l];
                a[l]=a[r];
                a[r]=tep;
                l++;
                r++;
            }
        }
    }
}