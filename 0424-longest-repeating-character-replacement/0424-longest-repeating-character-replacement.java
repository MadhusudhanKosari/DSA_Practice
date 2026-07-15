class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        int right = 0;
        int left = 0;
        int maxfreq = 0;
        int freq[] = new int[26];
        while(right < n){
            freq[s.charAt(right)- 'A']++;
            maxfreq  = Math.max(maxfreq,freq[s.charAt(right)- 'A']);
            if((right - left + 1) - maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                // maxlen = 0;
                left++;
            }
                maxlen = Math.max(maxlen,right-left+1);
            // if(right - left + 1 <= k){
            // }
            right++;
        }
        return maxlen;
    }
}