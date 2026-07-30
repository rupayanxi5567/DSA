class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        String clean=a.replaceAll("[^a-zA-Z0-9]","");
        int l=0,r=clean.length()-1;
        while(l<r){
            if(clean.charAt(l) != clean.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
}