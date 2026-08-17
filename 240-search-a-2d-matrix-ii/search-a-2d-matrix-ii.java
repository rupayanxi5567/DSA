class Solution {
    public boolean searchMatrix(int[][] a, int x) {
        int n=a.length;
        int m=a[0].length;
        int row=n-1,col=0;
        while(row>=0 && col<m){
            if(a[row][col]==x) return true;
            else if(a[row][col]>x)row--;
            else col++;
        }
        return false;
    }
}