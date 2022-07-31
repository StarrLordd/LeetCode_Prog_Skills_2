class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> group=new ArrayList<List<String>>();
        
        if(strs.length==0) return group;
        
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        
        for(String str:strs){
            int count[]=new int[26];
            for(int i=0;i<str.length();i++){
                count[str.charAt(i)-'a']++;
            }
            
            StringBuilder sb=new StringBuilder();
            for(int i:count){
                sb.append(i);
                sb.append("#");
            }
            String res=sb.toString();
            if(map.containsKey(res)){
                ArrayList<String> ana=map.get(res);
                ana.add(str);
                map.put(res,ana);
            }else{
                ArrayList<String> ana=new ArrayList<>();
                ana.add(str);
                map.put(res,ana);
            }
        }
        for(List<String> val: map.values()) group.add(val);
        return group;
    }
}