class Solution {
    public int myAtoi(String s) {
        // Step 1: Check if the string is empty
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Step 2: Trim leading and trailing whitespaces
        s = s.trim();

        // Step 3: Check if the trimmed string is empty
        if (s.length() == 0) {
            return 0;
        }

        // Step 4: Initialize sign and base value
        int sign = 1;
        int index = 0;
        int total = 0;

        // Step 5: Check for the sign
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // Step 6: Convert number and avoid overflow
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            // Check for overflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }
}
