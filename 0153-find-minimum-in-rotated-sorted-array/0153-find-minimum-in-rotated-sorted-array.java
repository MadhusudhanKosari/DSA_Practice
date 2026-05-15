class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // int min = nums[0];
        // return min;
        int low = 0;
        int n = nums.length;
        int high = n-1;
        int mid = 0;
        while(low<high){
            mid = (low+high)/2;
            if(nums[mid]> nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}