class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set=new HashSet<>();
        int l=0,r=k-1;
        int n=s.length();
        while(r<n){
            set.add(s.substring(l,r+1));
            l++;
            r++;
        }        
        return set.size()==Math.pow(2,k)?true:false;
    }
}