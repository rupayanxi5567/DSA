class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
        int cout=0;
        Map<Character,Integer> h = new HashMap<>();
        for(int i=0;i<3;i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        if(h.size()==3) cout++;
        int l=1,r=3;
        while(r==l+2 && r<s.length()){
            char lc=s.charAt(l-1);
            char rc=s.charAt(r);
            if(lc!=rc){
                h.put(lc,h.get(lc)-1);
                if(h.get(lc)==0) h.remove(lc);
                h.put(rc,h.getOrDefault(rc,0)+1);
            }
            if(h.size()==3) cout++;
            l++;
            r++;
        }
        return cout;
    }
}