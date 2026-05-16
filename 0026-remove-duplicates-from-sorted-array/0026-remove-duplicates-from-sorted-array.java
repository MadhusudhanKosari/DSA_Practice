class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> hs = new HashSet<>();
       int idx = 0;
       int count = 0;
       for(int i = 0;i<nums.length;i++){
        if(!hs.contains(nums[i])){
            nums[idx++] = nums[i];
            count++;
        }
        hs.add(nums[i]);
       }
       return count;
    }
}