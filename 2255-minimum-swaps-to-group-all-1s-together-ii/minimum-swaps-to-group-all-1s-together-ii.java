class Solution {
    public int minSwaps(int[] a) {
        int n=a.length;
    int zc=0,oc=0,mnc=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==1) oc++;
        }
        for(int i=0;i<oc;i++){
            if(a[i]==0) zc++;
        }
        mnc=Math.min(mnc,zc);
        int l=1,r=oc;
        while(r<2*n){
            if(a[(l-1)%n] != a[r%n]){
                if(a[(l-1)%n] == 0){
                    zc--;
                    mnc=Math.min(mnc,zc);
                }else{
                    zc++;
                    mnc=Math.min(mnc,zc);
                }
            }
            l++;
            r++;
        }
        return mnc;
    }
}