class Solution {
    public List<List<Integer>> fourSum(int[] a, int x) {
        Arrays.sort(a);
        List<List<Integer>> res=new ArrayList<>();
        int n=a.length;

        for(int i=0;i<=n-4;i++){
            if(i>0 && a[i]==a[i-1])continue;
            for (int j=i+1;j<=n-3;j++){
                if(j>i+1 && a[j]==a[j-1])continue;
                int l=j+1;
                int r=n-1;

                while(l<r){
                long sum = (long)a[i] + a[j] + a[l] + a[r];
                    if(sum==x){
                        res.add(Arrays.asList(a[i], a[j], a[l], a[r]));
                        while(l<r && a[l]==a[l+1])l++;
                        while(l<r && a[r]==a[r-1])r--;
                        l++;r--;
                    }else if(sum<x){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
    return res;
    }
}