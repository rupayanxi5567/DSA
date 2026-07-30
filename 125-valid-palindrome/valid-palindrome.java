class Solution {
    public boolean isPalindrome(String s) {
        // String clean=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int l=0,r=s.length()-1;
        while(l<r){
            char lc=s.charAt(l);
            char rc=s.charAt(r);

            if(!Character.isLetterOrDigit(lc)) {
                l++;
            }

            else if(!Character.isLetterOrDigit(rc)) {
                r--;
            }

            else{
                if(Character.toLowerCase(lc)!=Character.toLowerCase(rc)){
                    return false;
                }
                l++;r--;
            }
        }
        return true;
    }
}