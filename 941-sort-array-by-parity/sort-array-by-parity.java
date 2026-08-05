class Solution {
    public int[] sortArrayByParity(int[] a) {
        int n=a.length;
        int l=0,r=n-1;
        int []res=new int[n];

        while(l<r && r<n){
            while(l<r && r<n && a[l]%2==0) l++;
            while(l<r && r<n && a[r]%2!=0) r--;
            if(l<r && r<n){
                int tep=a[l];
                a[l]=a[r];
                a[r]=tep;
                l++;
                r--;
            }
            
        }
        return a;
    }
}