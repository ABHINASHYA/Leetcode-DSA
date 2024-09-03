class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        long res =  Long.MIN_VALUE;
        
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum>res){
                res=sum;
            }
            if(sum<0){
            sum= 0;
           
           }
        }
        
        return (int) res;
    }
}