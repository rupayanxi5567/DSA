class Solution {
    public int[] applyOperations(int[] a) {
        int n=a.length,l=0,r=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                a[i]=a[i]*2;
                a[i+1]=0;
            }
        }

        for(int i=0;i<n;i++){
            if(a[i]==0){
                l=i;
                break;
            }
        }
        r=l+1;

        while(r<n && a[r]==0){
            r++;
        }
        
        while(a[l]==0 && r<n){
            int tep=a[l];
            a[l]=a[r];
            a[r]=tep;

            l++;
            r++;

            while(a[l]!=0 && l<r && r<n) l++;
            while(r<n && a[r]==0) r++;
        }
        return a;
    }
}