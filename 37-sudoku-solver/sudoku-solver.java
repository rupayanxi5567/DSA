class Solution {
    private boolean fillSudokus(char[][] a, int row, int col, int[][] r, int[][] c, int[][] box) {
        if(row==9) {
            return true;
        }
        if(col==9){
            return fillSudokus(a, row+1, 0, r, c, box);
        }

        //  setup for recursioon
        if(a[row][col]!='.'){
            return fillSudokus(a, row, col +1, r, c, box);
        }
        else if(a[row][col]=='.'){
            for(int i=1;i<=9;i++){
                if(0==r[row][i] && 0==c[col][i] && 0==box[(row/3)*3+(col/3)][i]){
                    a[row][col]= (char) (i+'0');
                    r[row][i]=1;
                    c[col][i]=1;
                    box[(row/3)*3+(col/3)][i]=1;

                    boolean res=fillSudokus(a, row, col +1, r, c, box); //recursion done sucessfuully, now time to backtarck
                    if(res) return true;

                    //  setup for backtarck
                    a[row][col]= '.';
                    r[row][i]=0;
                    c[col][i]=0;
                    box[(row/3)*3+(col/3)][i]=0;
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] a) {
        int n=a.length;
        int [][]r=new int[9][10];
        int [][]c=new int[9][10];
        int [][]box=new int[9][10];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]=='.')continue;
                int val=a[i][j]-'0';
                r[i][val]=1;
                c[j][val]=1;
                box[(i/3)*3+(j/3)][val]=1;
            }
        }
        fillSudokus(a,0,0,r,c,box);
    }
}