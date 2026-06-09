class Solution {
    public int[] prefixSum(int arr[]){
        int ans[] = new int[arr.length];
        ans[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }
    public int[] postfixSum(int arr[]){
        int n = arr.length;
        
        int ans[] = new int[n];
        ans[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            ans[i] = ans[i+1] + arr[i];
        }
        return ans;
    }
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return 0;
        int prefixArr[] = prefixSum(nums);
        int postfixArr[] = postfixSum(nums);
        if(postfixArr[1] == 0) return 0;
        for(int i = 1;i<nums.length-1;i++){
            if(prefixArr[i-1] == postfixArr[i+1]){
                return i;
            }
        }
        if(prefixArr[n-2] == 0) return n-1;
        return -1;
    }
}