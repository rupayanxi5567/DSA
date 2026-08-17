class Solution {
    public int mySqrt(int n) {
        if (n == 1 || n == 0)
            return n;
        int ans = 0, l = 0, r = n / 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((long) m * m <= n) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}