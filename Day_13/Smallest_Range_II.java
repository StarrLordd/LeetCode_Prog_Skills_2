class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int res=nums[nums.length-1]-nums[0];
        for(int i=0;i<nums.length-1;i++){
            int min=Math.min(nums[0]+k,nums[i+1]-k);
            int max=Math.max(nums[nums.length-1]-k,nums[i]+k);
            res=Math.min(max-min,res);
        }
        return res;
    }
}