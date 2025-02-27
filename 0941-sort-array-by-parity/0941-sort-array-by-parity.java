class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int z=0;
        int n =nums.length;
        while(i<n){
            
                int temp = nums[i];
                nums[i] = nums[z];
                nums[z] = temp;
            
        
        if(nums[z]%2 == 0){
            z++;
        }
        i++;

        }
        return nums;
    }
}