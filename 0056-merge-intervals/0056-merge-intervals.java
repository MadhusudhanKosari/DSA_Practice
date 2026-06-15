class Solution {
    public int[][] merge(int[][] mat) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(mat,(a,b) -> a[0]- b[0]);
        int n = mat.length;
        for(int i = 0;i<n;i++){
            if(ans.isEmpty() || mat[i][0] > ans.get(ans.size()-1)[1]){
                ans.add(mat[i]);
            }
            else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],mat[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}