class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int l=0,cout=0,mxc=-1;
        Map<Character,Integer> h=new HashMap<>();
        for(int r=0;r<n;r++){
            char rc=s.charAt(r);
            h.put(rc,h.getOrDefault(rc,0)+1);
            if(h.get(rc)<=2){
                cout=r-l+1;
                mxc=Math.max(mxc,cout);
            }
            while(h.get(rc)>2){
            char lc=s.charAt(l);
                h.put(lc,h.get(lc)-1);
                if(h.get(lc)==0)h.remove(lc);
                l++;
            }
        }
        return mxc;
    }
}