class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k == n){
        int maxi = Integer.MIN_VALUE;
            for(int num : nums){
                maxi = Math.max(maxi,num);
            }
            return maxi;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        if(k == 1){
            int ans = -1;
            for(int num : nums){
                if(hm.get(num) == 1){
                    ans = Math.max(ans,num);
                }
            }
            return ans;
        }
        int ans = -1;
        if(hm.get(nums[0]) == 1){
            ans = Math.max(ans,nums[0]);
        }
        if(hm.get(nums[n-1]) == 1){
            ans = Math.max(ans,nums[n-1]);
        }
        return ans;
    }
}