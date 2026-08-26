class Solution {
    public boolean canConstruct(String a, String b) {
        Map<Character,Integer>h1=new HashMap<>();
        Map<Character,Integer>h2=new HashMap<>();
        for(char c:a.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        for(char c:b.toCharArray()){
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        if(h2.size()<h1.size()) return false;

        for(int i=0;i<a.length();i++){
            if(!h2.containsKey(a.charAt(i))) return false;
            if(h1.get(a.charAt(i))>h2.get(a.charAt(i)))return false;
        }
        return true;
    }
}