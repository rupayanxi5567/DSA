class Solution {
    public long maxSum(List<Integer> a, int m, int k) {
        int n=a.size();
        long mx=Integer.MIN_VALUE,s=0;
        int l=0,r=k-1;
        HashMap<Integer,Integer> h=new HashMap<>();


    for(int i=0;i<k;i++){
        h.put(a.get(i), h.getOrDefault(a.get(i), 0) + 1);
        s=s+a.get(i);
    }
    if(h.size()>=m) mx=Math.max(mx,s);
        l++;
        r++;

        while(r==l+k-1 && r<n){
            h.put(a.get(l-1),h.get(a.get(l-1))-1);
            if(h.get(a.get(l-1))==0){
                h.remove(a.get(l-1));
            }
            h.put(a.get(r), h.getOrDefault(a.get(r), 0) + 1);

            if(h.size()<m ){
                s=s-a.get(l-1)+a.get(r);
                l++;
                r++;
            }else{
                s=s-a.get(l-1)+a.get(r);
                mx=Math.max(mx,s);
                l++;
                r++;
            }

        }
    return mx==Integer.MIN_VALUE?0:mx;
    }
}