class Solution {
    public boolean cp(String a,int st,int end){
        if(end-st+1==1)return true;
        int l=st;
        int r=end;
        while(l<r){
            if(a.charAt(l)!=a.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public void checks(int j,List<String>al,List<List<String>>r,String a,int n){
        if(j==n){
            r.add(new ArrayList<>(al));
            return;
        }
        for(int i=j;i<n;i++){
            if(!cp(a,j,i))continue;
            al.add(a.substring(j, i + 1));
            checks(i+1,al,r,a,n);
            al.remove(al.size()-1);
        }
    }
    public List<List<String>> partition(String a) {
        int n=a.length();
        List<List<String>>r=new ArrayList<>();
        List<String>al=new ArrayList<>();
        checks(0,al,r,a,n);
        return r;
    }
}