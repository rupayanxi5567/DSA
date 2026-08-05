class Solution {
    public int findMaxLength(int[] a) {
        int z=0,o=0,n=a.length,res=0;
HashMap<Integer,Integer> h = new HashMap<>(); 

        for(int i=0;i<n;i++){
            if(a[i]==0) z++;
            else o++;
            int d=z-o;

            if(d==0) res=Math.max(res,i+1);

            if(!h.containsKey(d)){
                h.put(d,i);
            }else{
                int len=i-h.get(d);
                res=Math.max(res,len);
            }
        }
        return res;
    }
}