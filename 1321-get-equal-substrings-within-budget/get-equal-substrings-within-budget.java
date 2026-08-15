class Solution {
    public int equalSubstring(String s, String t, int p) {
        int n=s.length(),c=0,mxc=0;
        int l=0;
        for(int i=0;i<n;i++){
            int sc=s.charAt(i);
            int tc=t.charAt(i);
            int diff=Math.abs(sc-tc);
                p-=diff;
                c++;
            while(p<0){
                int lc_s=s.charAt(l);
                int lc_t=t.charAt(l);
                int d=Math.abs(lc_t-lc_s);
                p+=d;
                l++;
                c--;
            }
                mxc=Math.max(c,mxc);
        }
        return mxc;
    }
}