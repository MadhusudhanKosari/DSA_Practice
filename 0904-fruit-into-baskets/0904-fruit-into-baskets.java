class Solution {
    public int totalFruit(int[] fruits) {
        int maxi = 0;
        int n = fruits.length;
        Map<Integer,Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;
        while(right < n){
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
            if(hm.size()>2){
                while(hm.size()>2){

                hm.put(fruits[left],hm.get(fruits[left])-1);
                if(hm.get(fruits[left]) == 0){
                    hm.remove(fruits[left]);
                }
                left++;
                }
            }
            if(hm.size() <= 2){
                maxi = Math.max(maxi,right-left+1);
            }
            right++;
        }
        return maxi;
    }
}