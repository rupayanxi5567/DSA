class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(); 
        int n = s2.length(); 
        
        if (n < m) return false;

        HashMap<Character, Integer> sm = new HashMap<>(); 
        HashMap<Character, Integer> pm = new HashMap<>(); 
        int c = m;
        int l = 0;

        for (char x : s1.toCharArray()) {
            pm.put(x, pm.getOrDefault(x, 0) + 1);
        }

        for (int r = 0; r < n; r++) {
            char rightChar = s2.charAt(r);
            sm.put(rightChar, sm.getOrDefault(rightChar, 0) + 1);
            
            if (pm.containsKey(rightChar) && sm.get(rightChar) <= pm.get(rightChar)) {
                c--;
            }
            
            if (r - l + 1 > m) {
                char leftChar = s2.charAt(l);
                
                if (pm.containsKey(leftChar) && sm.get(leftChar) <= pm.get(leftChar)) {
                    c++;
                }
                sm.put(leftChar, sm.get(leftChar) - 1);
                if (sm.get(leftChar) == 0) sm.remove(leftChar);
                l++;
            }
            
            if (c == 0 && r - l + 1 == m) {
                return true;
            }
        }
        
        return false; 
    }
}