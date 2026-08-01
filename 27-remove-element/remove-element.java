class Solution {
    public int removeElement(int[] a, int x) {
        int n=a.length,l=0,r=n-1,cout=0;
        if(n==1 &&a[0]==x) return 0;
        while(l<r){
            while(l<n && l<r && a[l]!=x){
                l++;
            }
            while(r>=0 && l<r && a[r]==x){
                r--;
            }
            if(l<r){
                a[l]=a[r];
                r--;
            }
                
        }
        // for(int i=0;i<=l;i++){
        //     if(a[i]==x) break;
        //     cout++;

        // }
        return (l < n && a[l] == x) ? l : l + 1;    }
}