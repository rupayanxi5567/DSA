class Solution {
    public int removeElement(int[] a, int x) {
        int n=a.length,l=0,r=n-1,cout=0;
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
        
        return (l < n && a[l] == x) ? l : l + 1;    
        }
}