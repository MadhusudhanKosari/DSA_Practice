class Solution {
    public int majorityElement(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        boolean isvisit = true;
        int ans = 0;
        for(int num : nums){
            if(!hs.contains(num)){
                int count = 0;
                for(int i = 0;i<n;i++){
                    if(nums[i] == num){
                        count++;
                    }
                }
                if(count>n/2){
                    ans = num;
                    isvisit  = false;
                    break;
                }
            }
            hs.add(num);
            if(!isvisit){
                break;
            }
        }
        return ans;
    }
}