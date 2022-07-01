class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        int n=nums.length;
        int cur=k;
        List<Integer> res=new ArrayList<>();
        int i=n;
        while(--i>=0 || cur>0){
            if(i>=0) cur+=nums[i];
            res.add(cur%10);
            cur/=10;
        }
        Collections.reverse(res);
        return res;
    }
}