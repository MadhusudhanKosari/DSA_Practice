class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <=0){
            return 0;
        }
        int maxi = 1;
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]- nums[i-1] == 1){
                count++;
            }
            else{
                if(count>maxi){
                maxi = count;
                }
                count = 1;
            }
        }
        if(count > maxi) maxi = count;
        return maxi;
    }
}