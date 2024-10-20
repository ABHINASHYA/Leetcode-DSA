class Solution {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : target.toCharArray()) {
            sb.append('a');
            result.add(sb.toString());

            while (sb.charAt(sb.length() - 1) != c) {
                sb.setCharAt(sb.length() - 1, (char) ((sb.charAt(sb.length() - 1) - 'a' + 1) % 26 + 'a'));
                result.add(sb.toString());
            }
        }

        return result;

    }

    
}