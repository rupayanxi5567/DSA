class Solution {
    public void sortColors(int[] a) {
        int z=0,o=0,t=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)z++;
            else if(a[i]==1)o++;
            else if(a[i]==2)t++;
        }
        for(int i=0;i<z;i++){
            a[i]=0;
        }
        for(int i=z;i<z+o;i++){
            a[i]=1;
        }
        for(int i=z+o;i<a.length;i++){
            a[i]=2;
        }
    }
}