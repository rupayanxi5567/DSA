class Solution {
    public static void printsCombos(int[]a, int i,int t,ArrayList<Integer>al,int n,List<List<Integer>>r){
        if(i==n){
            if(t==0){
                r.add(new ArrayList<>(al));
            }
            return;
        }
        if(t-a[i]>=0){
            al.add(a[i]);
            printsCombos(a,i,t-a[i],al,n,r);
            al.remove(al.size()-1);
        }
        printsCombos(a,i+1,t,al,n,r);
    }
    public List<List<Integer>> combinationSum(int[] a, int t) {
        int i=0;
        int n=a.length;
        ArrayList<Integer>al=new ArrayList<>();
        List<List<Integer>>r=new ArrayList<>();
        printsCombos(a,i,t,al,n,r);
        return r;
    }
}