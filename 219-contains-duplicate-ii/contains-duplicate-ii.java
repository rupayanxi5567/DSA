class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        Map<Integer,Integer>h=new HashMap<>();
        int n=a.length,st=0,e=0;
        for(int i=0;i<n;i++){
            if(!h.containsKey(a[i])){
                h.put(a[i],i);
            }else{
                if(i-h.get(a[i])<=k){
                    return true;
                }else{
                    h.put(a[i],i);
                }
            } 
        }
        return false;
    }
}