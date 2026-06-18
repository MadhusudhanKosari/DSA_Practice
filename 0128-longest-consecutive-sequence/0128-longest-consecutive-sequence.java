class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <=0)return 0;
        Set<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int maxi = Integer.MIN_VALUE;
        for(int num : hs){
            if(!hs.contains(num-1)){
                int curr = num;
                int length = 1;
                while(hs.contains(curr+1)){
                    curr++;
                    length++;
                }
                maxi = Math.max(maxi,length);
            }
        }
        return maxi;
    }
}