class Solution {
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        return isPalindrome(s, 0);  // Start checking from index 0
    }
    
    public boolean isPalindrome(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        
        return isPalindrome(s, i + 1);
    }
}
