/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0,r=n;
        while(l<r){
            int m=l+(r-l)/2;
            boolean res=isBadVersion(m);
            if(!res){ //good version
                l=m+1;
            }else if (res){ //bad version
                r=m;
            }
        }
    return r;
    }
}