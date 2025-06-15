class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);

        // --- Maximize ---
        char toReplaceMax = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        String maxStr = (toReplaceMax == ' ') ? s : s.replace(toReplaceMax, '9');

        // --- Minimize ---
        char toReplaceMin = s.charAt(0); // Cannot replace leading digit with 0 if it is the leading one
        String minStr = s.replace(toReplaceMin, '0');

        int maxNum = Integer.parseInt(maxStr);
        int minNum = Integer.parseInt(minStr);

        return maxNum - minNum;
    }
}
