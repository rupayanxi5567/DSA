class Solution {
    public int subarraysWithKDistinct(int[] a, int k) {
        return atMax(a,k)-atMax(a,k-1);
    }
    public static int atMax(int []a,int k){

        int l=0,r=0,n=a.length,c=0;
        HashMap <Integer,Integer> h= new HashMap <>();

        for(r=0;r<n;r++){
            h.put(a[r],h.getOrDefault(a[r],0)+1);
            while(h.size()>k){
                h.put(a[l],h.get(a[l])-1);
                if(h.get(a[l])==0){
                    h.remove(a[l]);
                }
                l++;
            }
                c=c+r-l+1;
        }
        return c;
    }
    }
