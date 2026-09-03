class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        if(n == 1 && s.charAt(0) != '*') return false;
        int mcount = 0;
        int maxcount = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '('){
                mcount++;
                maxcount++;
            } 
            else if(s.charAt(i) == '*'){
                mcount--;
                maxcount++;
            }
            else{
                mcount--;
                maxcount--;
            }
            mcount = Math.max(0,mcount);
            if(maxcount<0) return false;
        }
        
       return mcount == 0;
    }
}