class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxi  = nums[n-1];
        if(maxi+1 != n) return false;
        for(int i = 0; i< n-2;i++){
            if(i+1 != nums[i]) return false;

        }
        if(nums[n-2] != n-1 || nums[n-1] != n-1){
            return false;
        }
        return true;
    }
}