class Solution {
    public static void prints(List<Integer>al,int[] a,boolean[] fq,List<List<Integer>>r,int n){
        if(al.size()==n){
            r.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<n;i++){
            if(!fq[i]){
                al.add(a[i]);
                fq[i]=true;
                prints(al,a,fq,r,n);
                al.remove(al.size()-1);
                fq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] a) {
        List<Integer>al=new ArrayList<>();
        List<List<Integer>>r=new ArrayList<>();
        int n=a.length;
        boolean []fq=new boolean[n];
        prints(al,a,fq,r,n);
        return r;
    }
}