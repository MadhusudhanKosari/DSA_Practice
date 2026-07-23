class Solution {
    HashSet<List<Integer>> hs = new HashSet<>();
    public void solve(int nums[],int idx,int target,List<List<Integer>> ans,List<Integer> op){
            if(target == 0 && !hs.contains(op)){
                ans.add(new ArrayList<>(op));
                hs.add(new ArrayList<>(op));
                return;
            }
        // if(idx == nums.length){
        // }
        for(int i = idx;i<nums.length;i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            if(nums[i]> target){
                break;
            }
            if(nums[i] <= target){
                op.add(nums[i]);
                solve(nums,i+1,target-nums[i],ans,op);
                op.remove(op.size()-1);
            }
        }
        // solve(nums,idx+1,target,ans,op);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        int idx = 0;
        List<Integer> op = new ArrayList<>();
        solve(candidates,idx,target,ans,op);
        return ans;
    }
}