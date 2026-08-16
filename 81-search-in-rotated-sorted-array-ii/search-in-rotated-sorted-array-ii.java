class Solution {
    public boolean search(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (x == a[m])
                return true;
            if (a[l] == a[m] && a[m] == a[r]) {
                l++;
                r--;
                continue;
            }
            else if (a[l] <= a[m]) {
                if (a[l] <= x && x < a[m]) {
                    r = m-1 ;
                } else {
                    l = m + 1;
                }
            } else {
                if (a[m] < x && x <= a[r]) {
                    l = m + 1;
                } else {
                    r = m-1 ;
                }
            }
        }
        return false;
    }
}