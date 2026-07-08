class Solution {
    public double power(double x,int N){
        if(N == 0) return 1;
        double half = power(x,N/2);
        if(N%2 == 0)
            return half*half;
        return x*half*half;
    }
    public double myPow(double x, int n) {
        int N = n;
        if(n < 0){
            x = 1/x;
            N = -n;
        }
        return power(x,N);
    }
}