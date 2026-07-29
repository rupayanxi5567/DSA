class Solution {
    public int trap(int[] a) {
        int n=a.length;
        int cout=0,l=0,r=n-1;
        int mlh=a[l],mrh=a[r];
        while(l<r){
            if(mlh<mrh){
                l++;
                mlh=Math.max(mlh,a[l]);
                cout=cout+(mlh-a[l]);
            }else{
                r--;
                mrh=Math.max(mrh,a[r]);
                cout=cout+(mrh-a[r]);
            }
        }
        return cout;
    }
}