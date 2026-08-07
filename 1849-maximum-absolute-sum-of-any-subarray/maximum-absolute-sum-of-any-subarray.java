class Solution {
    public int maxAbsoluteSum(int[] a) {
        int n=a.length;
        int be=a[0],nbe=a[0],ans=Math.abs(a[0]);

        for(int i=1;i<n;i++){
            be=Math.max(a[i],a[i]+be);
            nbe=Math.min(a[i],a[i]+nbe);

            ans=Math.max(ans,Math.max(Math.abs(be),Math.abs(nbe)));
        }
        return ans;
    }
}