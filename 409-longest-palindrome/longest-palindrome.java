class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> h = new HashMap<>();
        int len=0;
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        for(char k:h.keySet()){
            if(h.get(k) % 2==0 ){
                len+=h.get(k);
            }else if(len%2==0 && h.get(k) % 2==1 && h.get(k)>2){
                len+=h.get(k);
            }
            else if(len%2==1 && h.get(k) % 2==1 && h.get(k)>2){
                len+= h.get(k) - h.get(k)%2;
            }else if(h.get(k)==1 && len%2==0){
                len+=1;
            }
        }
        return len;
    }
}