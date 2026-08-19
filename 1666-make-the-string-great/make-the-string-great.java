class Solution {
    public String makeGood(String s) {
        Deque<Character>stk=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            int ascii_val=s.charAt(i);
            int ascii_val_of_peek=0;
            if (!stk.isEmpty()) ascii_val_of_peek=stk.peek();
            if(!stk.isEmpty() && Math.abs(ascii_val_of_peek-ascii_val)==32){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        if(stk.size()==0)return "";
        int i=0;
        char [] res_char_array=new char[stk.size()];
        while(!stk.isEmpty()){
            res_char_array[i]=stk.pop();
            i++;
        }
        String res=new String(res_char_array);
        String reversed=new StringBuilder(res).reverse().toString();
        return reversed;
    }
}