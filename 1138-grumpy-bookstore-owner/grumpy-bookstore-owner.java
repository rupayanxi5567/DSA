class Solution {
    public int maxSatisfied(int[] a, int[] g, int k) {
        int n=a.length;
        if(n==1 && k==1) return a[0];
        int bsc=0;
        int tsc=0;
        int mxsc=0;
        for(int i=0;i<n;i++){
            if(g[i]==0){
                bsc=bsc+a[i];
            }
        }

        for(int i=0;i<k;i++){
            if(g[i]==1){
                tsc += a[i];
                mxsc=Math.max(mxsc,tsc);
            }
        }
        int l=1,r=k;
        while(r<n){
            if(g[l-1] != g[r]){
                if(g[l-1] == 0){
                    tsc+=a[r];
                    mxsc=Math.max(mxsc,tsc);
                }else{
                    tsc-=a[l-1];
                }
            }else if(g[l-1]==1 && g[r]==1){
                tsc=tsc-a[l-1]+a[r];
                mxsc=Math.max(mxsc,tsc);
            }
            l++;
            r++;
        }
        return bsc+mxsc;
    }
}