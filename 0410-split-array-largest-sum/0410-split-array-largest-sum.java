class Solution {
    public int splitArray(int[] nums, int k) {
        int maxi = 0;
        int sum = 0;
        for(int num : nums){
            maxi = Math.max(maxi,num);
            sum+=num;
        }
        int ans =  sum;
        int low = maxi;
        int high = sum;
         int mid = (low+high)/2;
        while(low<= high){
            int insum = 0;
            int c = 1;
            for(int i = 0;i<nums.length;i++){
                insum += nums[i];
                if(insum>mid){
                    c++;
                    insum = nums[i];
                }
            }
            //c++;
            // ans = 0;
            if(c<=k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            mid = (low+ high)/2;
        }
        return ans;
    }
}