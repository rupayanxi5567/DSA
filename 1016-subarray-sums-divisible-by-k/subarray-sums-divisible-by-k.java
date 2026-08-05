class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int r=0,s=0,n=a.length;
        HashMap<Integer,Integer> h =new HashMap<>(); 

        h.put(0,1);

        for(int i=0;i<n;i++){
            s=s+a[i];
            int rem=s%k;
            if(rem<0) rem=rem+k;
            r=r+h.getOrDefault(rem, 0);
            h.put(rem, h.getOrDefault(rem, 0) + 1);
        }
        return r;
    }
}