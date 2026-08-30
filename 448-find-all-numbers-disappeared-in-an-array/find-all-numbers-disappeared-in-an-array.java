class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        Map<Integer,Integer>h=new HashMap<>();
        for(int x:a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        List<Integer>res=new ArrayList<>();
        for(int i=1;i<=a.length;i++){
            if(!h.containsKey(i)){
                res.add(i);
            }
        }
        return res;
    }
}