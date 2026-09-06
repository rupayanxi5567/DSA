class Solution {
    public boolean isValidSudoku(char[][] a) {
        int [][]r=new int[9][10];
        int [][]c=new int[9][10];
        int [][]box=new int[9][10];

        int n=a.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]=='.')continue;
                int val=a[i][j]-'0';
                if(r[i][val]==1 || c[j][val]==1 || box[(i/3)*3+(j/3)][val]==1) return false;

                r[i][val]=1;
                c[j][val]=1;
                box[(i/3)*3+(j/3)][val]=1;
            }
        }
        return true;
    }
}