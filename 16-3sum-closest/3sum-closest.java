class Solution {
    public int threeSumClosest(int[] a, int x) {
        int min_diff=Integer.MAX_VALUE;
        Arrays.sort(a); 
        int cs=a[0]+a[1]+a[2];
        int n = a.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = a[l] + a[r]+a[i];
                if (Math.abs(sum-x)<Math.abs(cs-x)) {
                    cs=sum;
                } if (sum < x) {
                    l++;
                   
                } else if (sum > x){
                    r--;
                }else{
                    return sum;
                }
            }
         
        }
           return cs;
    }
}


