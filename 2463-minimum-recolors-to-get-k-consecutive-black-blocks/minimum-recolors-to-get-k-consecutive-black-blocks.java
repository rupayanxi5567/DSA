class Solution {
    public int minimumRecolors(String s, int k) {
        int c=0,mnc=Integer.MAX_VALUE,n=s.length();
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W'){
                c++;
            }
        }
        mnc=Math.min(mnc,c);
        int l=1,r=k;
        while(r<n){
            char lc=s.charAt(l-1);
            char rc=s.charAt(r);
            if(lc!=rc){
                if(lc=='B') c++;
                else{
                    c--;
                    mnc=Math.min(mnc,c);
                }
            }
            l++;
            r++;

        }
        return mnc;
    }
}