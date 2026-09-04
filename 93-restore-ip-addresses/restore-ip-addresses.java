class Solution {
    public void generates(int j,List<String>r,List<String>p,int n,String s){
        if(p.size()==4){
            if(j==n){
                r.add(String.join(".",p));
            }
            return;
        }
        for(int i=j;i<n;i++){
            String seg=s.substring(j,i+1);
            if(Integer.parseInt(seg)>255)break;
            if(seg.length()>=2 && seg.startsWith("0"))break;
            p.add(seg);
            generates(i+1,r,p,n,s);
            p.removeLast();
        }
    }
    public List<String> restoreIpAddresses(String s) {
        List<String>r=new ArrayList<>();
        List<String>p=new ArrayList<>();
        int n=s.length();
        generates(0,r,p,n,s);
        return r;
    }
}