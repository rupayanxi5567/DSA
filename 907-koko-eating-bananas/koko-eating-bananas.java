class Solution {
    public static long checkEatingHour(int k,int[] a){
        long h=0;
        for(int i=0;i<a.length;i++){
            h += (a[i] + k - 1) / k;
        }
        return h;
    }

    public int minEatingSpeed(int[] a, int g) {
        int max = Arrays.stream(a).max().getAsInt();
        int l=1,r=max;
        int n=a.length;
        int ans=-1;
        while(l<=r){
            int k=l+(r-l)/2;
            long h=checkEatingHour(k,a);
            if(h>g){
                l=k+1;
            }else{
                ans=k;
                r=k-1;
            }
        }
        return ans;
    }
}