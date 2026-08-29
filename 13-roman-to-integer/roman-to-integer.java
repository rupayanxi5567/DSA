class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>h=new LinkedHashMap<>();
        h.put('M', 1000);
        h.put('D', 500);
        h.put('C', 100);
        h.put('L', 50);
        h.put('X', 10);
        h.put('V', 5);
        h.put('I', 1);

        int n=s.length();
        int x=0;
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(i!=n-1 &&  (c=='C' || c=='X' || c=='I')){
                char d=s.charAt(i+1);
                if(h.get(d)>h.get(c)){
                    x=x+h.get(d)-h.get(c);
                    i++;
                }else{
                    x=x+h.get(c);    
                }
            }else{
                x=x+h.get(c);
            }
        }
        return x;
    }
}