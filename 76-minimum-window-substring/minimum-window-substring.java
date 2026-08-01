class Solution {
    public String minWindow(String s, String t) {
        int []alph=new int[256];
        int n=s.length();
        int minStart=-1;
        int l=0,r=0,cout=t.length(),mn=Integer.MAX_VALUE;
        for(int i=0;i<cout;i++){
            alph[t.charAt(i)]++;
        }

        for(r=0;r<n;r++){
            alph[s.charAt(r)]--;
            if(alph[s.charAt(r)]>=0) cout--;
            while(cout==0){
                int len=r-l+1;
                if (len < mn) {
                    mn = len;
                    minStart = l;
                }               
                alph[s.charAt(l)]++;
                if(alph[s.charAt(l)]>0){
                    cout++;
                }
                    l++;
            }
        }
        return minStart == -1 ? "" : s.substring(minStart, minStart + mn);    }
}