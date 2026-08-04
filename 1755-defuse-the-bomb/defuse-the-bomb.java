class Solution {
    public int[] decrypt(int[] a, int k) {
        int l=1,r=k,s=0;
        int n=a.length;
        int []res=new int[n];
        int j=0; 
        
        if(k==0)
            return res;
        else if(k>0){
            l=1;
            r=k;
        }else{
            r=n-1;
            l=n-Math.abs(k);
        }

        
        for (int i = l; i <= r; i++) {
            s += a[i];
        }

        for(int i=0;i<n;i++){
            res[i]=s;
            s=s-a[ l%n ] + a[(r+1)%n];
            l=(l+1)%n;
            r=(r+1)%n;
        }
        return res;
    }
}