class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int n = people.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int sum = people[low] + people[high];
            if(sum == limit){
                count++;
                low++;
                high--;
            }
            else if(sum > limit){
                count++;
                high--;
            }
            else{
                low++;
                count++;
                high--;
            }
            sum = 0;
        }
        return count;
    }
}