class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans[] = new int[n+1];
        ans[0] = 0;
        int maxi = ans[0];
        int sum = 0;
        for(int i = 0;i<gain.length;i++){
            sum += (gain[i] + ans[i]);
            maxi = Math.max(maxi,sum);
            ans[i] = sum;
        }
        return maxi;
    }
}