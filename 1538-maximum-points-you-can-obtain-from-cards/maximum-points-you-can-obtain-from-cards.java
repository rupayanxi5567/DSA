class Solution {
    public int maxScore(int[] a, int k) {
    int n=a.length,s=0,mxs=-1;
    for(int i=0;i<n;i++){
        s=s+a[i];
    }
    int comp=n-k;
    int ws=0,mns=Integer.MAX_VALUE;
    for(int i=0;i<comp;i++){
        ws=ws+a[i];
    }
    mns=Math.min(mns,ws);
    int l=1,r=comp;
    while(r<n){
        ws=ws-a[l-1]+a[r];
        mns=Math.min(mns,ws);
        l++;
        r++;
    }
    return s-mns;
    }
}