class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        for(int i=0;i<len/2;i++){
            String subStr=s.substring(0,i+1);
            if(len%subStr.length()==0){
                int noOfRep=len/subStr.length();
                StringBuilder sb=new StringBuilder();
                while(noOfRep-->0){
                    sb.append(subStr);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}