class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>h=new HashSet<>();
        for(char c:s.toCharArray()){
            if(h.contains(c)){
                return c;
            }
            h.add(c);
        }
        return 'o';
    }
}