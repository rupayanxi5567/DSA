class Solution {
    private void generates(int[] col, int[] diagonal1, int[] diagonal2, List<String> lists, List<List<String>> res, int row, int n, char[] boards) {
        if(row==n){
            res.add(new ArrayList<>(lists));
            return;
        }
        Arrays.fill(boards,'.');
        for(int cols=0;cols<n;cols++){
            if(col[cols]==1 || diagonal1[row-cols+n-1]==1 || diagonal2[row+cols]==1)continue;

            boards[cols]='Q';
            col[cols]=1;
            diagonal1[row-cols+n-1]=1;
            diagonal2[row+cols]=1;
            lists.add(new String(boards));

            generates(col,diagonal1,diagonal2,lists,res,row+1,n,boards);

            boards[cols]='.';
            col[cols]=0;
            diagonal1[row-cols+n-1]=0;
            diagonal2[row+cols]=0;
            lists.removeLast();
        }
    }
    public List<List<String>> solveNQueens(int n) {
        int []col=new int[n];
        int []diagonal1=new int[2*n-1];
        int []diagonal2=new int[2*n-1];

        char[]boards=new char[n];

        List<String>lists=new ArrayList<>();
        List<List<String>>res=new ArrayList<>();

        int row=0;

        generates(col,diagonal1,diagonal2,lists,res,row,n,boards);

        return res;
    }


}