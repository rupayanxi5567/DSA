class Solution {
    public int maxNumberOfBalloons(String s) {
        Map<Character,Integer>h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        if(h.containsKey('b') && h.containsKey('a') && h.containsKey('l') && h.containsKey('o') && h.containsKey('n'))
                return Math.min(h.get('b'),Math.min(h.get('a'),Math.min(h.get('l')/2, Math.min(h.get('o')/2,h.get('n'))))) ;  
        return 0;
    }
}