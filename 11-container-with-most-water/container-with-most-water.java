class Solution {
    public int maxArea(int[] a) {
        int n=a.length;
        int l=0,r=n-1,mxa=-1;

        while(l<r){
            int prod=Math.min(a[l],a[r])*(r-l);
            
            if(mxa<prod){
                mxa=prod;
            }
            
            if(a[l]==a[r]){
                if(a[l+1]==Math.max(a[l+1],a[r-1])){
                    l++;
                }else if(a[r-1]==Math.max(a[l+1],a[r-1])){
                    r--;
                }
            }else{
                if(a[l]==Math.min(a[l],a[r])){
                    l++;
                }else if(a[r]==Math.min(a[l],a[r])){
                    r--;
                }
            }

            
        }//loop end
        return mxa;
    }
}