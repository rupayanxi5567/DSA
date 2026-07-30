class Solution {

    public static void rev(int []a,int l,int r){
        int n=a.length;
        while(l<r){
            int tep=a[l];
            a[l]=a[r];
            a[r]=tep;
            l++;r--;
        }
    }

    public void rotate(int[] a, int k) {
        int n=a.length;
        k=k%n;
        rev(a,0,n-1);
        rev(a,0,k-1);
        rev(a,k,n-1);
    }
}