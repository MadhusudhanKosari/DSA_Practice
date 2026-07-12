class Solution {
    public int[] arrayRankTransform(int[] arr) {
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        int n = arr.length;
        int[] nums = Arrays.copyOf(arr, n);
        Arrays.sort(arr);
        int idx = 1;
        int prev = 0;
        for(int i = 0;i<n;i++){
            if(hm.containsKey(arr[i])){
                idx-=1;
                hm.put(arr[i],idx++);
            }
            else{
                hm.put(arr[i],idx++);
            }
        }
        for(int i = 0;i<n;i++){
            nums[i] = hm.get(nums[i]);
        }
        return nums;
    }
}