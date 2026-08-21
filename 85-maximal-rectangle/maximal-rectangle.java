class Solution {
    
    public int calcArea(int []a){
        int mx=0,n=a.length;
        Deque<Integer>stk=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && a[stk.peek()]>a[i]){
                int h=stk.pop();
                int nse=i;
                int pse=stk.isEmpty()?-1:stk.peek();
                int area=a[h]*(nse-pse-1);
                mx=Math.max(mx,area);
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
                int h=stk.pop();
                int nse=n;
                int pse=stk.isEmpty()?-1:stk.peek();
                int area=a[h]*(nse-pse-1);
                mx=Math.max(mx,area);
        }
        return mx;
    }

    public int maximalRectangle(char[][] m) {
        int r=m.length,c=m[0].length,mx=0;
        int [][] psum=new int [r][c];
        for(int i=0;i<c;i++){
            int s=0;
            for(int j=0;j<r;j++){
                char ch = m[j][i];
                int digit = ch - '0';
                if(digit==0)s=0;
                else  s+=digit;
                psum[j][i]=s;
            }
        }
        for(int i=0;i<r;i++){
            int area=calcArea(psum[i]);
            mx=Math.max(area,mx);
        }
        return mx;
    }
}