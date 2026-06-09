class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long maxi = Long.MIN_VALUE;
        long mini = Long.MAX_VALUE;
        for(int num : nums){
            maxi = Math.max(maxi,num);
            mini = Math.min(mini,num);
        }
        long pro = (long)(k * (maxi - mini));
        return pro;
    }
}