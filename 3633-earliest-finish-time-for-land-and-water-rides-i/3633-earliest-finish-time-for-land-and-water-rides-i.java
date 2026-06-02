class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int fmin = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            int landendtime = landStartTime[i]+landDuration[i];
            for(int j = 0;j<m;j++){
                //int waterbegin = waterStartTime[j] + waterDuration[j];
                int maxwatertime = Math.max(landendtime,waterStartTime[j]);
                int waterendtime = maxwatertime+waterDuration[j];
                fmin = Math.min(fmin,waterendtime);
            }
        }
        int smin = Integer.MAX_VALUE;
        
        for(int i =0;i<m;i++){
            int waterendtime = waterStartTime[i]+waterDuration[i];
            for(int j = 0;j<n;j++){
                //int waterbegin = waterStartTime[j] + waterDuration[j];
                int maxLandtime = Math.max(waterendtime,landStartTime[j]);
                int landendtime = maxLandtime+landDuration[j];
                smin = Math.min(smin,landendtime);
            }
        }
            return Math.min(fmin,smin);
    }
}