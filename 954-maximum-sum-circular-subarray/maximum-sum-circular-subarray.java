class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int n=a.length;

        int be1=a[0];
        int ans1=be1;

        int be2=a[0];
        int ans2=be2;

        int sum=a[0];


        for(int i=1;i<n;i++){
            be1=Math.max(be1+a[i],a[i]);
            ans1=Math.max(ans1,be1);
        }

        for(int i=1;i<n;i++){
            be2=Math.min(be2+a[i],a[i]);
            ans2=Math.min(ans2,be2);
        }

        for(int i=1;i<n;i++){
            sum=sum+a[i];
        }
        if (ans1 < 0) {
            return ans1;
        }
        
        int diff=sum-ans2;
        int res=Math.max(ans1,diff);
        return res;
    }
}