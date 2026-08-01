class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,n=s.length(),max=-1;
        if(n==0) return 0;
        HashMap<Character,Integer>h=new HashMap<>();
        for(r=0;r<n;r++){
            h.put(s.charAt(r), h.getOrDefault(s.charAt(r), 0) + 1);
            while(h.size()<r-l+1){
                h.put(s.charAt(l),h.get(s.charAt(l))-1);
                if(h.get(s.charAt(l))==0){
                    h.remove(s.charAt(l));
                }
                l++;
            }
            int ran=r-l+1;
            if(h.size()==ran){
                max=Math.max(max,ran);
            }

        }
        return max;
    }
}