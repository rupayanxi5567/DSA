class Solution {
    public int findDuplicate(int[] a) {
        int s=0,f=0,n=a.length;
        while(true){
            s=a[s];
            f=a[a[f]];
            if(s==f){
                s=0;
                while(s!=f){
                    s=a[s];
                    f=a[f];
                }
                return s;
            }
        }
    }
}