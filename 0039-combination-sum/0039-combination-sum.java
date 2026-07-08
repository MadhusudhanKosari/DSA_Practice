class Solution {
    public void solve(int nums[],int target,List<Integer> op,int idx,List<List<Integer>> ans){
        if(idx == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(op));
            }
            return;
        }
        if(nums[idx] <= target){
            op.add(nums[idx]);
            solve(nums,target- nums[idx],op,idx,ans);
            op.remove(op.size()-1);
        }
        solve(nums,target,op,idx+1,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;
        List<Integer> op = new ArrayList<>();
        solve(candidates,target,op,idx,ans);
        return ans;
    }
}