class Solution {
    public boolean canJump(int[] nums) {
        int farPoint = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(i>farPoint){
                return false;
            }
            farPoint = Math.max(farPoint,i+nums[i]);
            if(farPoint >= n-1){
                return true;
            }
        }
        return false;
    }
}