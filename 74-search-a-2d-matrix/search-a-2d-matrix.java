class Solution {
    public boolean searchMatrix(int[][] a, int x) {
        if (a == null || a.length == 0) return false;
        
        int m = a.length, n = a[0].length;
        int l = 0, r = m * n - 1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int row = mid / n; // 1D to 2D Row Formula
            int col = mid % n; // 1D to 2D Col Formula
            
            if (a[row][col] == x) return true;
            else if (a[row][col] < x) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}