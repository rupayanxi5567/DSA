class Solution {
    public List<Integer> findDuplicates(int[] a) {
        Map<Integer,Integer>h=new HashMap<>();
        for(int x:a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        List<Integer>res=new ArrayList<>();
        for(int x:h.keySet()){
            if(h.get(x)==2){
                res.add(x);
            }
        }
        return res;
    }
}