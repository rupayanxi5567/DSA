class Solution {
    public int minOperations(int[] a, int x) {
        int n=a.length;
        int ts=0;
        for(int i=0;i<n;i++){
            ts+=a[i];
        }
        if(x>ts)return -1;
        int l=0,mn=Integer.MAX_VALUE,k=ts-x,s=0;
        for(int r=0;r<n;r++){
            s+=a[r];
            while(l<n && s>k){
                s-=a[l];
                l++;
            }
            if(s==k)mn=Math.min(mn,n-r+l-1);
        }
        return mn==Integer.MAX_VALUE?-1:mn;
    }
}