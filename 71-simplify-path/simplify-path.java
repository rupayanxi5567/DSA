class Solution {
    public String simplifyPath(String s) {

        String[] string_arr = s.split("/");
        Deque<String> stk = new ArrayDeque<>();

        for (String c : string_arr) {
            if (c.equals(".") || c.equals("")) {
                continue;
            } else if (c.equals("..")) {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } else {
                stk.push(c);
            }
        }
        if (stk.isEmpty())
            return "/";

        StringBuilder sb = new StringBuilder();

        while (!stk.isEmpty()) {
            sb.insert(0, "/" + stk.pop());
        }
        return sb.toString();
    }
}