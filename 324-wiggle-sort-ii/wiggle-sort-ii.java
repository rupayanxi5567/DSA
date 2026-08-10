class Solution {
    public void wiggleSort(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        int[] s=a.clone();
        int l=(n - 1) / 2,r=n-1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                a[i]=s[l];
                l--;
            }else{
                a[i]=s[r];
                r--;
            }
        }
    }
}