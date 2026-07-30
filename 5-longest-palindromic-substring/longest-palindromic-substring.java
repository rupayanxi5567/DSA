class Solution {
    public String longestPalindrome(String s) {
        int n=s.length(),maxs=-1;
        int el=0,ol=0,st=0;
        for(int i=0;i<n;i++){
            el=expand_to_l_and_right(s,i,i+1);
            ol=expand_to_l_and_right(s,i,i);
            int len=Math.max(el,ol);
            if(len>maxs){
                maxs=len;
                st=i-(len-1)/2;
            }
        }
        return s.substring(st,st+maxs);
    }

    public static int expand_to_l_and_right(String s,int l,int r){
        int n=s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;r++;
        }
        return r-l-1;
    }

}