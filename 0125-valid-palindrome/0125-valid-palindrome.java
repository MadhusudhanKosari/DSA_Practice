class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        int high = sb.length()-1;
        while(low<=high){
            while(sb.charAt(low) != sb.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}