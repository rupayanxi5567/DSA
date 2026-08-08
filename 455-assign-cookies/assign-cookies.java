class Solution {
    public int findContentChildren(int[] g, int[] c) {
        Arrays.sort(g);
        Arrays.sort(c);
        int l=0,r=0,sc=0;
        int m=g.length,n=c.length;
        while(l<m && r<n){
            if(c[r]>=g[l]){
                sc++;
                l++;
                r++;
            }else{
                r++;
            }
        }
        return sc;
    }
}