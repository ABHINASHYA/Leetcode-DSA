class Solution {
    public int singleNumber(int[] arr) {
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-1; i=i+2){
        //     if(nums[i] != nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length-1];
        int n = arr.length;
        for(int i=0; i<n; i++){
            int num = arr[i];
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j]== num){
                    count++;
                }
                
            }
            if(count == 1) return num;
        }
        return -1;
    }    //coplexity= nlogn*n
}