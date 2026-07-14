class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxi = 0;
        for(int i = 0;i<nums.length;i++){
            int temp = k;
            int len = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j] == 0) temp--;
                if(temp <0){
                    break;
                }
                len++;
            }
            maxi = Math.max(maxi,len);
        }
        return maxi;
    }
}