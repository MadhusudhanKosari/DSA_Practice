class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int idx = 0;
        while(i<chars.length){
            char curr = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == curr){
                count++;
                i++;
            }
            chars[idx++] = curr;
            if(count > 1){
                String cnt = count + "";
                for(char ch : cnt.toCharArray()){
                    chars[idx++] = ch;
                }
            }
        }
        return idx;
    }
}