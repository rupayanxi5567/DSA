class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l=0,n=s.length(),m=p.length();
        List<Integer> res =new ArrayList<>();
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> pm = new HashMap<>();
        int c=m;

        for(char x:p.toCharArray()){
            pm.put(x,pm.getOrDefault(x,0)+1);
        }

        for(int r=0;r<n;r++){
            sm.put(s.charAt(r),sm.getOrDefault(s.charAt(r),0)+1);
            if(pm.containsKey(s.charAt(r)) && sm.get(s.charAt(r)) <= pm.get(s.charAt(r))){
                c--;
            }
            if(r-l+1 > m){
                if(pm.containsKey(s.charAt(l)) && sm.get(s.charAt(l))<=pm.get(s.charAt(l))) c++;
                sm.put(s.charAt(l),sm.get(s.charAt(l))-1);
                if(sm.get(s.charAt(l))==0) sm.remove(s.charAt(l));
                l++;
            }
            if(c==0 && r-l+1==m){
                res.add(l);
            }
        }
        return res;
    }
}