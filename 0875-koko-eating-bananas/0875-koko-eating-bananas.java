class Solution {
    public long findCeil(int piles[],int h){
        long count = 0;
        for(int i = 0;i<piles.length;i++){
            count+=(long)Math.ceil((double)piles[i]/h);
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        for(int num : piles){
            high = Math.max(high,num);
        }
        int low = 1;
        while(low<=high){
            int mid = (low+high)/2;
            long hrs = findCeil(piles,mid);
            if(hrs<=h){
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return low;
    }
}