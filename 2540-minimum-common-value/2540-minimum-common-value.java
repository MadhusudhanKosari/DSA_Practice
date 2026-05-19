class Solution {
    public boolean binarySearch(int arr[],int k){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return true;
            }
            else if(arr[mid]< k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
    public int getCommon(int[] nums1, int[] nums2) {
        // HashSet<Integer> hs = new HashSet<>();
        // for(int num : nums1){
        //     hs.add(num);
        // }
        // for(int num : nums2){
        //     if(hs.contains(num)){
        //         return num;
        //     }
        // }
        // return -1;
        // boolean visit = false;
        for(int num : nums1){
            if(binarySearch(nums2,num)){
                return num;
            }
        }
        return -1;
    }
}