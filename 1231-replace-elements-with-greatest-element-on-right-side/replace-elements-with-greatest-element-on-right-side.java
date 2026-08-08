class Solution {
    public int[] replaceElements(int[] a) {
        int n=a.length,mr=-1;
        for(int i=n-1;i>=0;i--){
            int cur=a[i];
            a[i]=mr;
            mr = Math.max(mr, cur);
        }
        return a;
    }
}