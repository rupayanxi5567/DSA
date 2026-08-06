class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        int s=0,n=a.length;
        Map<Integer,Integer>h=new HashMap<>();
        h.put(0,-1);

        for(int i=0;i<n;i++){
            s=s+a[i];
            int rem=s%k;
            if(h.containsKey(rem)){
                int len=i-h.get(rem);
                if(len>=2){
                    return true;
                }
            }else{
                h.put(rem,i);
            }
        }
        return false;
    }
}