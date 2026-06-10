class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp[] = new int[nums.length];
        int low = 0;
        int n = nums.length;
        int high = n-1;
        int idx = n-1;
        while(low <= high){
            if(nums[low] * nums[low] < nums[high] * nums[high]){
                temp[idx--] = nums[high] * nums[high];
                high--;
            }
            else{
                temp[idx--] = nums[low] * nums[low];
                low++;
            }
        }
        return temp;
    }
}