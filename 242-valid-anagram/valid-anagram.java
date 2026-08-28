class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer>sh=new HashMap<>();
        // Map<Character,Integer>th=new HashMap<>();
        
        for(char c:s.toCharArray()){
            sh.put(c,sh.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!sh.containsKey(c)){
                return false;
            }
            sh.put(c,sh.get(c)-1);
            if(sh.get(c)==0)sh.remove(c);
        }
        if(sh.size()==0) return true;
        return false;
    }
}