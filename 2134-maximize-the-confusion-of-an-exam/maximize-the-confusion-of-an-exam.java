class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int l=0,c=0,mxc=-1,chng=0,tc=0,fc=0;
        int n=a.length();
        for(int r=0;r<n;r++){
            if(a.charAt(r)=='T')tc++;
            else fc++;
            chng=Math.min(tc,fc);
            while(chng>k){
                if(a.charAt(l)=='T')tc--;
                else fc--;
                chng=Math.min(tc,fc);
                l++;
            }
            mxc=Math.max(mxc,r-l+1);
        }
        return mxc;
    }
}