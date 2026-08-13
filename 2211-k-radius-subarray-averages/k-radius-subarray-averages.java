class Solution {
    public int[] getAverages(int[] a, int k) {
        int n=a.length;
        if (n == 1 && k>0) return new int[]{-1};
        if (n == 1 && k==0) return new int[]{a[0]};
        int[]res=new int[n];
        Arrays.fill(res, -1);
        if ((long)2 * k + 1 > n) return res;
        int sz=2*k+1;
        int l=0,r=sz-1,m=k;
        long s=0;
        long avg=0;
        for(int i=0;i<=r;i++){
            s=s+a[i];
            avg=(int)(s/sz);
        }
        res[m]=(int)avg;
        // for(int i=0;i<m;i++) a[i]=-1;
        if(r<n){
            r++;
            l++;
            m++;
        }
        while(r<n){
            s=s-a[l-1]+a[r];
            avg=(int)(s/sz);
            res[m]=(int)avg;
            r++;
            l++;
            m++;
        }
        // for (int i = 0; i < n; i++) {
        //     res[i] = (res[i] == 0) ? -1 : res[i];
        // }        
        return res;
    }
}