class Solution {
    public int numSubarraysWithSum(int[] a, int k) {
        return atMost(a, k) - atMost(a, k - 1);
    }

    private int atMost(int[] a, int goal) {
        if (goal < 0) return 0;

        int l = 0, s = 0, count = 0;
        for (int r = 0; r < a.length; r++) {
            s += a[r];
            while (s > goal) {
                s -= a[l];
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }
}