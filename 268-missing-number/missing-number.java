class Solution {
    public int missingNumber(int[] a) {
        int n=a.length;
        Set<Integer>h=new HashSet<>();
        for(int x:a){
            h.add(x);
        }
        for(int i=0;i<=n;i++){
            if(!h.contains(i)){
                return i;
            }
        }
        return -1;
    }
}