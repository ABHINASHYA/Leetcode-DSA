class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low = 0, high = nums[nums.length - 1] - nums[0];

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFormPairs(nums, mid, p)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFormPairs(int[] nums, int maxDiff, int p) {
        int count = 0;
        for (int i = 1; i < nums.length;) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                count++;
                i += 2; // both used
            } else {
                i++;
            }

            if (count >= p) return true;
        }
        return count >= p;
    }
}
