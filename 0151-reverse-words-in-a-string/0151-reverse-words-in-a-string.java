class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.split("\\s+");
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return String.join(" ",arr);
    }
}