class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer>h=new HashMap<>();
        for(char c:t.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(h.containsKey(c)){
                h.put(c,h.get(c)-1);
                if(h.get(c)==0){
                    h.remove(c);
                }
            }
        }
        return h.keySet().iterator().next();
    }
}