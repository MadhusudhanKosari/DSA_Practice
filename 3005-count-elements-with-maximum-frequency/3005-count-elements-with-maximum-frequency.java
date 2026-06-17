class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxi = 0;
        int count = 0;
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
            maxi = Math.max(hm.get(num),maxi);
        }
        // for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        //     if(entry.getValue() == maxi){
        //         count++;
        //     }
        // }
        for(int num : nums){
            if(hm.get(num) == maxi){
                count++;
            }
        }
        return count;
    }
}