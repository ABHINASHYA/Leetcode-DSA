class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int res = 0;
        
        for (int i = 0; i < n; i++) {
            int[] count = new int[26];
            for (int j = i; j < n; j++) {
                count[s.charAt(j) - 'a']++;
                if (hasKFrequency(count, k)) {
                    res++;
                }
            }
        }
        
        return res;
    }
    
    private boolean hasKFrequency(int[] count, int k) {
        for (int freq : count) {
            if (freq >= k) {
                return true;
            }
        }
        return false;

    }
}