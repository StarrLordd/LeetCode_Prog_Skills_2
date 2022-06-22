class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        int res=-1;
        if(haystack.equals(needle)) return 0;
        for(int i=0;i<haystack.length()-len+1;i++){
            if(haystack.substring(i,i+len).equals(needle)) return i;
        }
        return res;
    }
}