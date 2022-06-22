class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean status=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                status=false;
                break;
            }
        }
        boolean st=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                st=false;
                System.out.print(i);
                break;
            }
        }
        return status || st;
    }
}