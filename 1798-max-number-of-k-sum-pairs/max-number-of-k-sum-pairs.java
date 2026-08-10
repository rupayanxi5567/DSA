class Solution {
    public int maxOperations(int[] a, int k) {
        Arrays.sort(a);
        int n=a.length;
        int l=0,r=n-1;
        int c=0;

        while(l<r){
            int s=a[l]+a[r];
            if(s==k){
                c++;
                l++;
                r--;
            }else if(s<k){
                l++;
            }else{
                r--;
            }
        }
        return c;
    }
}