class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int l=0,r=n-1;
        char[] arr = s.toCharArray(); 
        while(l<r){
            while(l < s.length() && "aeiouAEIOU".indexOf(s.charAt(l)) == -1){
                l++;
            }
            while(r < n && l<r && "aeiouAEIOU".indexOf(s.charAt(r)) == -1){
                r--;
            }
            if(l<r && r<n){
                char tep=arr[l];
                arr[l]=arr[r];
                arr[r]=tep;
                l++;r--;
            }
        }
        // char[] arr = {'h', 'e', 'l', 'l', 'o'};

        String res = String.valueOf(arr);
        return res;
    }
}