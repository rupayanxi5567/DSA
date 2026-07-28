class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = a.length;
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            int l=i+1,r=a.length-1;
            int x=-a[i];
            while(l<r){
                int sum=a[l]+a[r];
                if(sum==x){
                    ans.add(Arrays.asList(a[i], a[l], a[r]));
                    l++;
                    r--;
                    while (l < r && a[l] == a[l - 1]) l++;
                    while (l < r && a[r] == a[r + 1]) r--;
                    
                    // return
                }else if(a[l]+a[r]<x){
                    l++;
                    // while(l<n && a[l]==a[l-1])l++;
                }else{
                    r--;
                    // while(r>=0 && a[r]==a[r+1])r--;
                }
            }
        }
        return ans;
    }
}