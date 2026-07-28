class Solution {
    public int[] sortedSquares(int[] a) {
        int n=a.length;
        int []r=new int[a.length];
        int i=0,j=n-1,k=n-1;
        while(i<=j){
            if(Math.abs(a[i])<Math.abs(a[j])){
                r[k]=a[j]*a[j];
                j--;
                k--;
            } else{
                r[k]=a[i]*a[i];
                i++;
                k--;
            }
        }
        return r;
    }
}