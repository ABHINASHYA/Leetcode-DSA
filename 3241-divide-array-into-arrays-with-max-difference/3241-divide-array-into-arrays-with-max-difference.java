class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length / 3;
        int[][] result = new int[n][3];

        for (int i = 0; i < nums.length; i += 3) {
            int a = nums[i], b = nums[i + 1], c = nums[i + 2];
            if (c - a > k) {
                return new int[0][0]; // Empty array
            }
            result[i / 3][0] = a;
            result[i / 3][1] = b;
            result[i / 3][2] = c;
        }

        return result;
    }
}