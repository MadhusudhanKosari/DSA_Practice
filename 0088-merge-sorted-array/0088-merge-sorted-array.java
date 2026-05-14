class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int len = m + n;
        int ans[] = new int[len];

        int p1 = 0;
        int p2 = 0;
        int idx = 0;

        while(p1 < m && p2 < n){

            if(nums1[p1] <= nums2[p2]){
                ans[idx++] = nums1[p1++];
            }
            else{
                ans[idx++] = nums2[p2++];
            }
        }

        while(p1 < m){
            ans[idx++] = nums1[p1++];
        }

        while(p2 < n){
            ans[idx++] = nums2[p2++];
        }

        for(int i = 0; i < len; i++){
            nums1[i] = ans[i];
        }
    }
}