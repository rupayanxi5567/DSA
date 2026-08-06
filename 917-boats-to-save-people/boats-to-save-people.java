class Solution {
    public int numRescueBoats(int[] a, int x) {
        Arrays.sort(a);
        int n=a.length;
        int l=0,r=n-1,c=0;

        while(l<=r){
            if(a[l]==x){
                c++;
                l++;
            }else if(a[r]==x){
                c++;
                r--;
            }else if(a[l]+a[r]<=x){
                c++;
                l++;
                r--;
            }else if(a[l]+a[r]>x && a[r]<=x){
                r--;
                c++;
            }else if(r==l && a[l]<=x){
                c++;
                r--;
                l++;
            }
        }
        return c;       
    }
}