class Solution {
    public void helper(int nums[],List<List<Integer>> ans,int length,int target,int idx,List<Integer> curr){
        if(curr.size() == length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
                // return;
            }
            return;
        }
        if(idx == nums.length) return;
        if(nums[idx]<=target){
            curr.add(nums[idx]);
            helper(nums,ans,length,target- nums[idx],idx+1,curr);
            curr.remove(curr.size()-1);
        }
        helper(nums,ans,length,target,idx+1,curr);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int nums[] = {1,2,3,4,5,6,7,8,9};
        helper(nums,ans,k,n,0,new ArrayList<>());
        return ans;
    }
}