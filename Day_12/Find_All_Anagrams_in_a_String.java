class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()) return res;
        char[] sarray = s.toCharArray();
        char[] parray=p.toCharArray();
        int count1[]= new int[26];
        int count2[] =new int[26];
        for(int i=0;i<parray.length;i++){
            count1[parray[i] -'a']++;
            count2[sarray[i]-'a']++;
        }
        for(int i=0;i<sarray.length-parray.length+1;i++){
            if(Arrays.equals(count1,count2)){
                res.add(i);
            }
            if(i==sarray.length-parray.length){
                break;
            }
            count2[s.charAt(i)-'a']--;
            count2[s.charAt(i+p.length())-'a']++;
        }
        return res;
    }
}