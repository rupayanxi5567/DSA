class Solution {
    public int[] intersect(int[] a, int[] b) {
        Map<Integer,Integer>h=new HashMap<>();
        int max_len=Math.max(a.length,a.length);
        List<Integer>al=new ArrayList<>();
        // int []res=new int[max_len];
        int k=0;
        for(int x:a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int x:b){
            if(h.containsKey(x)){
                al.add(x);
                // res[k++]=x;
                h.put(x,h.get(x)-1);
                if(h.get(x)==0)h.remove(x);
            }
        }
        int []res=new int[al.size()];
        for(int x:al){
            res[k++]=x;
        }
        return res;
    }
}