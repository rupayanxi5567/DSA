class Solution {
    public int numOfSubarrays(int[] a, int k, int t) {
        int s=0,n=a.length,c=0;
        float avg=0;
        for(int i=0;i<k;i++){
            s=s+a[i];
            avg=(float)s/k;
        }
        if(avg>=t) c++;
        int l=1,r=k;

        while(r==l+k-1 && r<n){
            s=s-a[l-1]+a[r];
            avg=(float)s/k;
            if(avg>=t) c++;
            l++;
            r++;
        }
        return c;
    }
}