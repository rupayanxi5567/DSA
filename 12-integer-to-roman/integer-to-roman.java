class Solution {
    public String intToRoman(int n) {
        Map<Integer,String>h=new LinkedHashMap<>();
        h.put(1000, "M");
        h.put(900, "CM");
        h.put(500, "D");
        h.put(400, "CD");
        h.put(100, "C");
        h.put(90, "XC");
        h.put(50, "L");
        h.put(40, "XL");
        h.put(10, "X");
        h.put(9, "IX");
        h.put(5, "V");
        h.put(4, "IV");
        h.put(1, "I");

        StringBuilder sb=new StringBuilder();

        for(int x:h.keySet()){
            if(x==n){
                sb.append(h.get(x));
                break;
            }
            while(n>=x){
                sb.append(h.get(x));
                n=n-x;
            }
        }
        return sb.toString();




    }
}