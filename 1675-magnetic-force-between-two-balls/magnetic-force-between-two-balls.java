class Solution {
    public int check(int[] a, int m){
        int c=1,l=0,r=1;
        for(r=1;r<a.length;r++){
            if(a[r]-a[l]>=m){
                c++;
                l=r;
            }
        }
        return c;
    }
    public int maxDistance(int[] a, int k) {
        Arrays.sort(a);
        int l=1,r=a[a.length-1],ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            int res=check(a,m);
            if(res<k){
                r=m-1;
            }else{
                ans=m;
                l=m+1;
            }
        }
        return ans;
    }
}