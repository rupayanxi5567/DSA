class Solution {
    public int triangleNumber(int[] a) {
        Arrays.sort(a);
        int l=0,r=0,cout=0,n=a.length;
        for(int i=n-1;i>=2;i--){
            l=0;
            r=i-1;
            while(l<r){
                if(a[l]+a[r]>a[i]){
                    cout=cout+(r-l);
                    r--;
                }else{
                    l++;
                }
            }
        }
        return cout;
    }
}