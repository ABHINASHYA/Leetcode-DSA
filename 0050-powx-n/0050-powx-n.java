class Solution {
    public double myPow(double x, int n) {
        //return Math.pow(x,n); // high compexity---O(x^n) //this is one line code
       return find(x,(long) n);
    }
    double find(double x, long n){
        if(n<0){
            return 1.0/find(x, -n);
        }
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        double ans=find(x, n/2);
        if(n%2==0){
            return ans*ans;
        }
        return x*ans*ans;
    }
}