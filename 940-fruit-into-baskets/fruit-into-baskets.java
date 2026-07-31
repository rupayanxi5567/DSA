class Solution {
    public int totalFruit(int[] a) {
        int l=0,r=0,n=a.length,mx=-1;
        HashMap<Integer,Integer>h=new HashMap<>();
        if(n==1) return 1;
        for(r=0;r<n;r++){
            h.put(a[r],h.getOrDefault(a[r], 0)+1);
            while(h.size()>2){
                h.put(a[l],h.get(a[l])-1);
                if(h.get(a[l])==0){
                    h.remove(a[l]);
                }
                l++;
            }
            if(h.size()<=2){
                int ran=r-l+1;
                mx=Math.max(mx,ran);
            }
        }    
        return mx;
    }
}