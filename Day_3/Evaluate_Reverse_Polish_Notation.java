class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s=new Stack<>();
        for(String str:tokens){
            if(isOperator(str)){
                int el2=Integer.parseInt(s.pop());
                int el1=Integer.parseInt(s.pop());
                int ans=0;
                if(str.equals("+")) ans=el1+el2;
                else if(str.equals("-")) ans=el1-el2;
                else if(str.equals("*")) ans=el1*el2;
                else if(str.equals("/")) ans=el1/el2;
                s.push(String.valueOf(ans));
            }
            else{
                s.push(str);
            } 
        }
        return Integer.parseInt(s.peek());
    }
    boolean isOperator(String s){
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
            return true;
        else return false;
    }
}