class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] sneakyNumbers = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && count < 2) {
                sneakyNumbers[count++] = nums[i];
            }
        }
        return sneakyNumbers;
    }
}



