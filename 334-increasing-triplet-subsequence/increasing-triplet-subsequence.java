class Solution {
    public boolean increasingTriplet(int[] a) {
        int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE;
        for(int i:a){
            if(i<=f) f=i;
            else if(i<=s) s=i;
            else return true;
        }
        return false;
    }
}