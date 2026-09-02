class Solution {
    public static void printsCombos(int[]a, int i,int t,ArrayList<Integer>al,int n,List<List<Integer>>r){
        if(t==0){
            r.add(new ArrayList<>(al));
            return;
        }
        for(int j=i;j<n;j++){
            if(j>i && a[j]==a[j-1]) continue;
            if(t-a[j]<0) break;
            al.add(a[j]);
            printsCombos(a,j+1,t-a[j],al,n,r);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] a, int t) {
        Arrays.sort(a);
        int i=0;
        int n=a.length;
        ArrayList<Integer>al=new ArrayList<>();
        List<List<Integer>>r=new ArrayList<>();
        printsCombos(a,i,t,al,n,r);
        return r;
    }
}