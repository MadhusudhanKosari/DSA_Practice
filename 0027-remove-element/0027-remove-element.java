class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int num : nums){
            if(num != val){
                count++;
                ans.add(num);
            }
        }
        for(int i =  0;i<ans.size();i++){
            nums[i] = ans.get(i);
        }
        return count;
    }
}