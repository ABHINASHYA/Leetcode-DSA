class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        int total=0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            total -= nums[i];
            if(total==sum){
                return i;
            }
            else{
                sum += nums[i];
            }
        }
        return -1;
    }
}