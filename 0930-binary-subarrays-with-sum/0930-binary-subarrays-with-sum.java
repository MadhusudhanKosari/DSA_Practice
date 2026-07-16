class Solution {
    public int atMost(int nums[],int k){
        if(k <0 ) return 0;
        int l = 0;
        int r = 0;
        int count = 0;
        int n = nums.length;
        int sum = 0;
        while(r<n){
            sum += nums[r];
            while(sum >k){
                sum -= nums[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return  atMost(nums,goal) - atMost(nums,goal-1);
    }
}