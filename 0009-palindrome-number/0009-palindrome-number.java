class Solution {
    int rev =0;
    void helper(int x){
        if(x==0) return;

        rev = rev*10+ (x%10);
        helper(x/10);
    }

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        helper(x);

        return x== rev;
    }
}