class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
         Arrays.sort(nums);
        int subSets = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int num = 0;num < subSets;num++){
            List<Integer> res = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if((num&(1<<i)) != 0){
                    res.add(nums[i]);
                }
            }
            if(!hs.contains(res)){
                ans.add(res);
            }
            hs.add(res);
        }
        return ans;
    }
}