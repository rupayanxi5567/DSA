class Solution {
    public void sortColors(int[] a) {
        int n=a.length;
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(a[m]==2){
                int tep=a[m];
                a[m]=a[h];
                a[h]=tep;
                h--;
            }else if(a[m]==1) {
                m++;
            }else if(a[m]==0){
                int tep=a[m];
                a[m]=a[l];
                a[l]=tep;
                // h--;
                l++;
                m++;
            }
        }
    }
}