class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            sum += nums[i];
            if(nums[i]> sum){
                sum = nums[i];
            }
            max = sum;
            maxi = Math.max(maxi,max);
        }
        return maxi;
    }
}