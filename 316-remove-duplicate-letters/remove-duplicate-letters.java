// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.HashMap;
// import java.util.Map;

class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> h = new HashMap<>();
        Map<Character, Integer> cout = new HashMap<>();
        Deque<Character> stk = new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            h.put(c,i);
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(cout.containsKey(c))continue;
            while(!stk.isEmpty() && c<stk.peek() && i<h.get(stk.peek())){
                cout.remove(stk.pop());
            }
                stk.push(c);
                cout.put(stk.peek(),1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:stk){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}