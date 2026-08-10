class Solution {
    public int maxVowels(String s, int k) {
        int c=0,mx=0,n=s.length();
        for(int i=0;i<k;i++){
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                c++;
                mx=Math.max(mx,c);
            }
        }
        if(mx==k) return k;
        int l=1,r=k;

        while(r==l+k-1 && r<n){
            if ("aeiouAEIOU".indexOf(s.charAt(l-1)) != -1) {
                c--;
            }
            if ("aeiouAEIOU".indexOf(s.charAt(r)) != -1) {
                c++;
                mx=Math.max(mx,c);
            }
            if(mx==k) return k;
            l++;
            r++;
        }
        return mx;
    }
}