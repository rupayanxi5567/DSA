class Solution {
    public String getHint(String s, String g) {
        int b=0,c=0;
        Map<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char gi=g.charAt(i);
            if(ch==gi){
                b++;
                if(h.containsKey(gi)){
                    h.put(gi,h.get(gi)-1);
                    if(h.get(gi)==0)
                        h.remove(gi);
                }
            }     
        }

        for(int i=0;i<g.length();i++){
            char ch=s.charAt(i);
            char gi=g.charAt(i);
            if(ch!=gi && h.containsKey(gi)){
                    c++;
                    h.put(gi,h.get(gi)-1);
                    if(h.get(gi)==0)
                        h.remove(gi);
            }
        }
                
        StringBuilder sb=new StringBuilder();
        sb.append(b);
        sb.append("A");
        sb.append(c);
        sb.append("B");
        return sb.toString();
    }
}