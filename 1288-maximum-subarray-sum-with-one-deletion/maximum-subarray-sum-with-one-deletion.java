class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int noDelete = arr[0];
        int oneDelete = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            oneDelete = Math.max(oneDelete + arr[i], noDelete);
            
            noDelete = Math.max(arr[i], noDelete + arr[i]);

            maxSum = Math.max(maxSum, Math.max(noDelete, oneDelete));
        }

        return maxSum;
    }
}