class Solution {
    public int majorityElement(int[] a) {
        int n=a.length,x=0;
        Map<Integer,Integer>h=new HashMap<>();
        for(int i:a){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>Math.floor(n/2)){
                x= i;
                break;
            }
        }
        return x; 
    }
}