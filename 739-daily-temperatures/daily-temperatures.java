class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n = a.length;
        int x = 0;
        int[] res = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && a[i] >= a[stk.peek()]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stk.peek() - i;
            }
            stk.push(i);
        }
        return res;
    }
}