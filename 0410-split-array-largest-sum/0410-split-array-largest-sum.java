class Solution {
    public static int countSplit(int[] nums, int maxSum){
        int n = nums.length;
        int split = 1;
        long subarraySum = 0;

        for(int i=0; i<n; i++){
            if(subarraySum + nums[i] <= maxSum){
                subarraySum += nums[i];
            }else{
                split++;
                subarraySum = nums[i];
            }
        }
        return split;
    }
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;

        for(int i=0; i<nums.length; i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while(low <= high){
            int mid = (low + high)/2;
            int split = countSplit(nums, mid);
            if(split > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}