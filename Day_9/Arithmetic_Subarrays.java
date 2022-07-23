class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res=new ArrayList<Boolean>();
        for(int i=0;i<r.length;i++){
            int temp[]=new int[r[i]+1-l[i]];
            int start=l[i],end=r[i];
            int c=0;
            for(int j=start;j<=end;j++){
                temp[c]=nums[j];
                c++;
            }
            Arrays.sort(temp);
            boolean st=true;
            for(int j=2;j<temp.length;j++){
                if((temp[j]-temp[j-1])!=temp[1]-temp[0]){
                    st=false;
                    break;
                }
            }
            if(st) res.add(true);
            else res.add(false);
        }
        return res;
    }
}