class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int x = nums[i];
            String s = Integer.toString(x);
            int low = 0;
            while(low<s.length()){
                int val = s.charAt(low) - '0';
                ans.add(val);
                low++;
            }
        }
        int nl = ans.size();
        int res[] = new int[nl];
        for(int i =  0;i<nl;i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}