class Solution {
    public boolean canPlaceFlowers(int[] a, int c) {
        int n=a.length,cout=c;
        if(cout<=0) return true;
        for(int i=0;i<n;i++){
           
            if(a[i]==0 && (i==0 || a[i-1]==0) && (i==n-1 || a[i+1]==0)){
                a[i]=1;
                cout--;
            }
            
            
            
            


            if(cout==0){
                return true;
            }
        }
        return false;
    }
}