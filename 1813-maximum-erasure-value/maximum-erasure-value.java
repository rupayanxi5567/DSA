class Solution {
    public int maximumUniqueSubarray(int[] a) {
        int l=0,s=0,mxs=-1;
        int n=a.length;
        Map<Integer,Integer>h=new HashMap<>();
        for(int r=0;r<n;r++){
            h.put(a[r],h.getOrDefault(a[r],0)+1);
            s=s+a[r];
            while(r-l+1>h.size()){
                s=s-a[l];
                h.put(a[l],h.get(a[l])-1);
                if(h.get(a[l])==0)h.remove(a[l]);
                l++;
            }
            mxs=Math.max(s,mxs);
        }
        return mxs;
    }
}