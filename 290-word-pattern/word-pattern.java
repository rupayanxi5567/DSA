class Solution {
    public boolean wordPattern(String p, String s) {
        String []str=s.split(" ");
        
        int n1=p.length();
        int n2=str.length;
        if(n1!=n2)return false;

        Map<Character,String>h1=new HashMap<>();
        Map<String,Character>h2=new HashMap<>();
        

        for(int i=0;i<n1;i++){
            char c=p.charAt(i);
            String d=str[i];

            if(h1.containsKey(c) && !h1.get(c).equals(d)) return false;
            if(h2.containsKey(d) && h2.get(d)!=c) return false;

            h1.put(c,d);
            h2.put(d,c);
        }
        return true;

    }
}