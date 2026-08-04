class Solution {
    public int longestOnes(int[] a, int k) {
        int n=a.length,zc=0,cc=0,mc=-1;
        int l=0,r=0;
        for(r=0;r<n;r++){
            if(a[r]==0) zc++;
            while(zc>k){
                if(a[l]==0) zc--;
                l++;
            }
            mc=Math.max(mc,r-l+1);
        }
        return mc;
    }
}