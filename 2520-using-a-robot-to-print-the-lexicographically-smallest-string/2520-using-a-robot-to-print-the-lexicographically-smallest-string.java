class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        char[] minSuffix = new char[n];
        minSuffix[n - 1] = s.charAt(n - 1);

        // Build suffix minimum array
        for (int i = n - 2; i >= 0; i--) {
            minSuffix[i] = (char) Math.min(s.charAt(i), minSuffix[i + 1]);
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            stack.push(s.charAt(i));
            // Pop from stack while top is <= min character in the suffix
            while (!stack.isEmpty() && (i == n - 1 || stack.peek() <= minSuffix[i + 1])) {
                result.append(stack.pop());
            }
        }

        // Pop any remaining characters
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
