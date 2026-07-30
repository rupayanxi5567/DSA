class Solution {
    public boolean checkValidPalindrome(String s,int l,int r){
        while(l<r){
            char lc=s.charAt(l);
            char rc=s.charAt(r);

            if(lc!=rc){
                return false;
            }
            l++;r--;
        }
        return true;
    }


    public boolean validPalindrome(String s) {
        int n=s.length();
        int l=0,r=n-1;
        while(l<r){
            char lc=s.charAt(l);
            char rc=s.charAt(r);

            if(lc!=rc){
                return checkValidPalindrome(s,l,r-1) || checkValidPalindrome(s,l+1,r);
            }
            l++;r--;
        }
        return true;
    }
}