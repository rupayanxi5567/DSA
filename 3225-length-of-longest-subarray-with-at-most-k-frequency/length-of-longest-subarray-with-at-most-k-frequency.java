class Solution {
    public int maxSubarrayLength(int[] a, int k) {
        int l=0,mx=-1,n=a.length;
        Map<Integer,Integer>h=new HashMap<>();
        for(int r=0;r<n;r++){
            h.put(a[r],h.getOrDefault(a[r],0)+1);
            while(h.get(a[r])>k){
                h.put(a[l],h.get(a[l])-1);
                if(h.get(a[l])==0)h.remove(a[l]);
                l++;
            }
            mx=Math.max(mx,r-l+1);
        }
        return mx;
    }
}