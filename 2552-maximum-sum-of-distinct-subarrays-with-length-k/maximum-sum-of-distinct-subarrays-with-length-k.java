class Solution {
    public long maximumSubarraySum(int[] a, int k) {
        int n=a.length;
        long mx=Integer.MIN_VALUE,s=0;
        int l=0,r=k-1;
        HashMap<Integer,Integer> h=new HashMap<>();


    for(int i=0;i<k;i++){
        h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        s=s+a[i];
    }
    if(h.size()==k) mx=Math.max(mx,s);
        l++;
        r++;

        while(r==l+k-1 && r<n){
            h.put(a[l-1],h.get(a[l-1])-1);
            if(h.get(a[l-1])==0){
                h.remove(a[l-1]);
            }
            h.put(a[r], h.getOrDefault(a[r], 0) + 1);

            if(h.size()!=k ){
                s=s-a[l-1]+a[r];
                l++;
                r++;
            }else{
                s=s-a[l-1]+a[r];
                mx=Math.max(mx,s);
                l++;
                r++;
            }

        }
    return mx==Integer.MIN_VALUE?0:mx;
    }
}