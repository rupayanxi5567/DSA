class Solution {
    public void moveZeroes(int[] a) {
        int l=0,r=1,n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                l=i;
                r=i+1;
                break;
            }
        }
        while(l<r && r<n){
            if(a[r]!=0 && a[l]==0){
                int tep=a[l];
                a[l]=a[r];
                a[r]=tep;
                l++;
                r++;
            }else if(a[r]==0){
                r++;
            }else if(a[l]!=0){
                l++;
            }
        }
    }
}