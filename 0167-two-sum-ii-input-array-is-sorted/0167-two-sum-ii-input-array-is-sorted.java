class Solution {
    public int binarySearch(int nums[],int k){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == k){
                return mid;
            }
            else if(nums[mid] > k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int n = numbers.length;
        // int low = 0;
        // int high = n-1;
        // while(low < high){
        //     int sum = numbers[low] + numbers[high];
        //     if(sum == target){
        //         ans[0] = low+1;
        //         ans[1] = high+1;
        //         return ans;
        //     }
        //     else if(sum > target){
        //         high--;
        //     }
        //     else{
        //         low++;
        //     }
        // }
        for(int i = 0;i<n;i++){
            int k = target - numbers[i];
            int idx = binarySearch(numbers,k);
            if( idx != -1 && idx != i){
                ans[0] = i + 1;
                ans[1] = idx +1;
                break;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}