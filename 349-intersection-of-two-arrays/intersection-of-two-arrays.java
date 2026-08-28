class Solution {
    public int[] intersection(int[] a, int[] b) {
        Set<Integer>h=new HashSet<>();
        Set<Integer>res_h=new HashSet<>();
        for(int x:a){
            h.add(x);
        }
        for(int x:b){
            if(h.contains(x)){
                res_h.add(x);
            }
        }
        int []res=new int[res_h.size()];
        int i=0;
        for(int x:res_h){
            res[i++]=x;
        }
        return res;
    }
}