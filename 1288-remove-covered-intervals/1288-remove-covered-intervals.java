class Solution {
    public int removeCoveredIntervals(int[][] mats) {
        Arrays.sort(mats,(a,b) -> {
            if(a[0] == b[0]){
                return b[1] - a[1];
            }
            return a[0] - 
            b[0];
        });
        int rem = 0;
        int maxEnd = 0;
        for(int mat[] : mats){
            if(mat[1] > maxEnd){
                rem++;
                maxEnd = mat[1];
            }
        }
        return rem;
    }
}