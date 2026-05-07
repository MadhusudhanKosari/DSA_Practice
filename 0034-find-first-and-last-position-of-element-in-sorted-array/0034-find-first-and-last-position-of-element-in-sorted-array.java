class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        int mid= 0;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] >= target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(low >= nums.length || nums[low] != target) return arr;
        // if(nums[low] == target) 
        arr[0] = low;
        //low = 0;
        high = nums.length-1;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] <= target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        // if(nums[high] == target) 
        arr[1] = high;
        return arr;
    }
}