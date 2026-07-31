class Solution {
    public int countSubstrings(String s) {
        int n=s.length(),maxs=-1;
        int cout=0;
        for(int i=0;i<n;i++){
            cout=cout+expand_to_l_and_right(s,i,i+1);
            cout=cout+expand_to_l_and_right(s,i,i);
        }
        return cout;
    }
    

public static int expand_to_l_and_right(String s,int l,int r){
        int n=s.length();
        int cout=0;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;r++; cout++;
        }
        return cout;
    }

}