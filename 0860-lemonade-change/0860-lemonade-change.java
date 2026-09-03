class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int sum = 0;
        int fcount = 0;
        int tcount = 0;
        for(int i = 0;i<n;i++){
            if(bills[i] == 5){
                fcount++;
            }
            else if(bills[i] == 10){
                if(fcount <= 0) return false;
                tcount++;
                fcount--;
            }
            else{
                if((tcount >= 1 && fcount >=1)){
                    tcount--;
                    fcount--;
                }
                else if(fcount>=3){
                    fcount -= 3;
                }
                else{
                    return false;
                }

            }
        }
        return true;
    }
}