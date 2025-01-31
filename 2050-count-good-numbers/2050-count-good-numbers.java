class Solution {

    private static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        return (int) (myPow(5, (n + 1) / 2) * myPow(4, n / 2) % MOD);
    }
    private long myPow(long base, long exponent) {
        long result = 1; // Start from the identity value
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                // If the current exponent bit is 1, multiply the result by base
                result = (result * base) % MOD;
            }
            // Square base and move to the next bit of the exponent
            base = (base * base) % MOD;
            exponent >>= 1; // Right shift exponent by 1 (equivalent to dividing by 2)
        }
        return result;
    }    
}