class Solution {
    public double myPow(double b, int n) {
    double res = 1.0;
        long e = n;
        
        if(e < 0){
            b = 1/b;
            e = -e;
        }
        
        while(e > 0){
            if(e%2 == 1){
                res *= b;
            }
            b *= b;
            e /= 2;
        }
        return res;
    }
}