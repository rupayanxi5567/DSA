class Solution {
    public void rev(int []a){
        int l=0,r=a.length-1;
        while(l<r){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
    }
    public boolean creates(int j,int[] a,int s,int lim,int n,boolean[]v,int k){
        if(k==1)return true;
        if(s==lim){
            return creates(0,a,0,lim,n,v,k-1);
        }
        for(int i=j;i<n;i++){
            if(v[i] || s+a[i]>lim)continue;
            if(i>j && a[i]==a[i-1] && !v[i-1])continue;
            v[i]=true;
            if(creates(i+1,a,s+a[i],lim,n,v,k))return true;
            v[i]=false;
            if (s == 0) return false;
        }
        return false;
    }
    public boolean canPartitionKSubsets(int[] a, int k) {
        Arrays.sort(a);
        rev(a);
        int sum=0;
        for(int x:a){
            sum+=x;
        }
        int n=a.length;
        boolean[]v=new boolean[n];
        int lim=sum/k; // 5 er limit rak
        if(sum%k!=0)return false;
        return creates(0,a,0,lim,n,v,k);
    }
}