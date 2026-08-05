class Solution {
    public int subarraySum(int[] a, int k) {
        int n=a.length, s=0;
        int r=0;
        HashMap<Integer,Integer>h=new HashMap<>(); 
        h.put(0, 1);

        for(int i=0;i<n;i++){
            s=s+a[i];
            int qn=s-k;
            int fq = h.getOrDefault(qn, 0);
            r=r+fq;
            h.put(s,h.getOrDefault(s,0)+1);
        }
        return r;
    }
}