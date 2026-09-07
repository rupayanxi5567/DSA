class Solution {
    private boolean generates(char[][] a, int i, int r, int c, String w,int n) {
        if(i==n){
            return true;
        }
        int m=a.length;
        int nn=a[0].length;
        if(r<0 || r>=m || c<0 || c>=nn || a[r][c]!=w.charAt(i)) return false;
        char tep=a[r][c];
        a[r][c]='#';
        boolean res=generates(a, i + 1, r + 1, c, w,n) ||
                generates(a, i + 1, r - 1, c, w,n) ||
                generates(a, i + 1, r, c + 1, w,n) ||
                generates(a, i + 1, r, c - 1, w,n);
        a[r][c]=tep;
        return res;
    }
    public boolean exist(char[][] a, String w) {
        int m=a.length;
        int nn=a[0].length;
        int n = w.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<nn;j++){
                if(a[i][j]==w.charAt(0)){
                    if(generates(a,0,i,j,w,n))return true;
                }
            }
        }
        return false;
    }


}