class Solution {
    public int[] twoSum(int[] a, int x) {
        int val=0;
        int n=a.length;
        int []res=new int[2];
        Map<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(x-a[i])){
                val=a[i];
                res[0]=i;
                break;
            }else{
                h.put(a[i],i);
            }
        }
        res[1]=h.get(x-val);
        return res;
    }
}