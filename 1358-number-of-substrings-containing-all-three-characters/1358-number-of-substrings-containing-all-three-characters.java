class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        // int ans = 0;
        // int left = 0;
        // int freq[] = new int[3];
        // for(int right = 0;right<n;right++){
        //     freq[s.charAt(right) - 'a']++;
        //     while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
        //         ans += (n - right);
        //         freq[s.charAt(left) - 'a']--;
        //         left++;
        //     }
        // }
        // return ans;
        int lastSeen[] = {-1,-1,-1};
        int count = 0;
        for(int i = 0;i<n;i++){
            lastSeen[s.charAt(i)-'a'] = i;
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                count = count + (1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])));
                
            }
        }
        return count;
    }
}