class Solution {
    public int minElement(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int sum = 0;
            int temp = nums[i];
            while(temp>0){
                int rem = temp%10;
                sum += rem;
                temp /= 10;
            }
            nums[i] = sum;
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}