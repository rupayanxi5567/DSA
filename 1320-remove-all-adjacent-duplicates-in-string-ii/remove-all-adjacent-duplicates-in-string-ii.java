class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<Character> cs = new ArrayDeque<>();
        Deque<Integer> ns = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char si=s.charAt(i);
            if(cs.isEmpty() && ns.isEmpty()){
                cs.push(si);
                ns.push(1);
            }else{
                if(si==cs.peek()){
                    cs.push(si);
                    ns.push(ns.pop()+1);
                    if(ns.peek()==k){
                        for(int j=1;j<=k;j++)cs.pop();
                        ns.pop();
                    }
                }else{
                    cs.push(si);
                    ns.push(1);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:cs){
            sb.append(c);
        }
        return sb.reverse().toString();
        
    }
}