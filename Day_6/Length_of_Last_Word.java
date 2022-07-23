class Solution {
    public int lengthOfLastWord(String s) {
        Stack<String> st=new Stack<>();
        String str="";
        boolean status=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                str+=c;
                status=false;
            }
            else{
                if(str!="")st.push(str);
                str="";
                status=true;
            }
            if(!status) st.push(str);
        }
        return st.peek().length();
    }
}