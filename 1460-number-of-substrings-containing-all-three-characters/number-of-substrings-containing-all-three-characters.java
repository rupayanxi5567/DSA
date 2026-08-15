class Solution {
    public int numberOfSubstrings(String a) {
        int l=0,c=0,n=a.length();
        Map<Character,Integer>h=new HashMap<>();
        for(int r=0;r<n;r++){
            h.put(a.charAt(r),h.getOrDefault(a.charAt(r),0)+1);
            while(h.size()==3){
                c=c+n-r;
                h.put(a.charAt(l),h.get(a.charAt(l))-1);
                if(h.get(a.charAt(l))==0)h.remove(a.charAt(l));
                l++;
            }
        }
        return c;
    }
}