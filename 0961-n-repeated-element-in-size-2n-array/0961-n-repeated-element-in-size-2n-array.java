class Solution {
    public int repeatedNTimes(int[] nums) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // Should not reach here given the problem constraints
    }
}