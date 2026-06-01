class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0;
        Arrays.sort(cost);
        int n = cost.length;
        int l = 0;
        for(int i = n-1;i>=0;i--){
            if(l < 2){
                sum += cost[i];
                l++;
            }
            else if(l == 2){
                l = 0;
            }
        }
        return sum;
    }
}