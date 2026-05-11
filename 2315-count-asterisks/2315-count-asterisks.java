class Solution {
    public int countAsterisks(String s) {
        int lcount = 0;
        int acount = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '*' && lcount == 0){
                acount++;
            }
            if(ch == '|'){

                if(lcount == 0){
                    lcount = 1;
                }
                else{
                    lcount = 0;
                }
            }
        }
        return acount;
    }
}