class Solution {
public int find_max_freq(int[] alph) {
    int maxFreq = 0;
    for (int count : alph) {
        maxFreq = Math.max(maxFreq, count);
    }
    return maxFreq; 
}


    public int characterReplacement(String s, int k) {
        int max=-1,l=0,r=0,n=s.length();
        int []alph=new int[256];
        for(r=0;r<n;r++){
            alph[s.charAt(r)]++;
            int len=r-l+1;
            int mx=find_max_freq(alph);
            int diff=len-mx;
            while(diff>k){
                alph[s.charAt(l)]--;
                l++;
                mx=find_max_freq(alph);
                len=r-l+1;
                diff=len-mx;
            }
            len=r-l+1;
            max=Math.max(max,len);
        }
        return max;
    }
}