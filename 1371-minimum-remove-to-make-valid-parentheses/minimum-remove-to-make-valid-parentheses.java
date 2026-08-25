class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer>stk=new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(stk.isEmpty() && (c=='(' || c==')')){
                stk.push(i);
            }else if(!stk.isEmpty() && (c=='(' || c==')')){
                if('(' == c || (')' == c && s.charAt(stk.peek())==')' ) ){
                    stk.push(i);
                }else if(')' == c && s.charAt(stk.peek())=='(' ){
                    stk.pop();
                }
            }
        }
        Set<Integer>hs=new HashSet<>();
        while(!stk.isEmpty()){
            hs.add(stk.pop());
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            if(!hs.contains(i)){
                sb.append(s.charAt(i));
            }
        }

    return sb.toString();

    }
}