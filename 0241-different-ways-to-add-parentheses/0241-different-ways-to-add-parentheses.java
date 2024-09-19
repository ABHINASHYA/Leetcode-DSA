class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        // Base case: expression is a number
        if (expression.matches("\\d+")) {
            result.add(Integer.parseInt(expression));
            return result;
        }
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                // Recursively compute left and right expressions
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                
                // Combine results
                for (int l : left) {
                    for (int r : right) {
                        switch (c) {
                            case '+':
                                result.add(l + r);
                                break;
                            case '-':
                                result.add(l - r);
                                break;
                            case '*':
                                result.add(l * r);
                                break;
                        }
                    }
                }
            }
        }
        
        return result;
    }
}

