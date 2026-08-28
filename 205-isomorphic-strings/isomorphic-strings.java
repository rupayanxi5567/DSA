class Solution {
    public boolean isIsomorphic(String s, String t) {

        int n1=s.length();
        int n2=t.length();

        if(n1!=n2)return false;

        Map<Character,Character>h1=new HashMap<>();
        Map<Character,Character>h2=new HashMap<>();

        for(int i=0;i<n1;i++){
            char c=s.charAt(i);
            char d=t.charAt(i);

            if(h1.containsKey(c) && h1.get(c)!=d)return false;
            if(h2.containsKey(d) && h2.get(d)!=c)return false;

            h1.put(c,d);
            h2.put(d,c);            
        }
        return true;
    }
}