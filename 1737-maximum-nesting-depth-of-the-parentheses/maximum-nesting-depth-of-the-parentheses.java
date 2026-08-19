class Solution {
    public int maxDepth(String s) {
        int maxCount = 0;
        Deque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(s.charAt(i));
                maxCount = Math.max(maxCount, stk.size());
            } else if (s.charAt(i) == ')') {
                stk.pop();
            }
        }
        return maxCount;
    }
}