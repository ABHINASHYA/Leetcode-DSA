class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);

        // ----- Get Maximum -----
        // Replace the first non-9 digit with 9
        char[] maxChars = s.toCharArray();
        char replaceMax = 0;
        for (char c : maxChars) {
            if (c != '9') {
                replaceMax = c;
                break;
            }
        }
        for (int i = 0; i < maxChars.length; i++) {
            if (maxChars[i] == replaceMax) {
                maxChars[i] = '9';
            }
        }
        int max = Integer.parseInt(new String(maxChars));

        // ----- Get Minimum -----
        // If first digit isn't 1, replace it with 1 (can't use 0 for first digit)
        // Else find the first digit (not 0 or 1) and replace with 0
        char[] minChars = s.toCharArray();
        char replaceMin = 0;

        if (minChars[0] != '1') {
            replaceMin = minChars[0];
            for (int i = 0; i < minChars.length; i++) {
                if (minChars[i] == replaceMin) {
                    minChars[i] = '1';
                }
            }
        } else {
            for (int i = 1; i < minChars.length; i++) {
                if (minChars[i] != '0' && minChars[i] != '1') {
                    replaceMin = minChars[i];
                    break;
                }
            }
            for (int i = 0; i < minChars.length; i++) {
                if (minChars[i] == replaceMin) {
                    minChars[i] = '0';
                }
            }
        }

        int min = Integer.parseInt(new String(minChars));

        return max - min;
    }
}
