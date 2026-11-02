class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        return Math.max(robRange(nums, 1, n - 1),
                        robRange(nums, 0, n - 2));
    }

    private int robRange(int[] a, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int cur = Math.max(a[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}