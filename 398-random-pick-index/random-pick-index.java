class Solution {

    Map<Integer,List<Integer>>h;
    Random r;

    public Solution(int[] a) {
        r=new Random();
        h=new HashMap<>();
        for(int i=0;i<a.length;i++){
            h.putIfAbsent(a[i],new ArrayList<>());
            h.get(a[i]).add(i);
        }        
    }
    
    public int pick(int x) {
        List<Integer> list = h.get(x);
        int randomIndex = r.nextInt(list.size());
        return list.get(randomIndex);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */