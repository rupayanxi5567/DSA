class Solution {
    public int minimumDifference(int[] a, int k) {
        int min=Integer.MAX_VALUE;
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<=n-k;i++){
            int diff=a[k+i-1] - a[i];
            min=Math.min(min,diff);
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}