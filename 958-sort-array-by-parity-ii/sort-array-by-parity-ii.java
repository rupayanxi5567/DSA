class Solution {
    public int[] sortArrayByParityII(int[] a) {
        int n=a.length;
        int l=0,r=1;

        while(r<n && a[r]%2 != 0) r=r+2;
        while(l<n && a[l]%2 == 0) l=l+2;

        while(l<n && r<n){
            while(l<n && a[l]%2 == 0) l=l+2;
            while(r<n && a[r]%2 != 0) r=r+2;
            if(l<n && r<n){
                int tep=a[l];
                a[l]=a[r];
                a[r]=tep;
                l=l+2;
                r=r+2;
            }
        }
        return a;
    }
}