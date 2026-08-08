class Solution {
    
    public static int sq_of_dig(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            s=s+(d*d);
        }
        return s;
    }
    
    public boolean isHappy(int n) {
        int s=n,f=n;
        while(f!=1){
            s=sq_of_dig(s);
            f=sq_of_dig(f);
            f=sq_of_dig(f);
            if(s==f && s!=1) return false;
        }
        return true;
    }
}