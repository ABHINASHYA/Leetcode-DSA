//class Solution {
//    public void sortColors(int[] nums) {
//        Arrays.sort(nums);
//    }
//}

/*class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            while (count[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }
}*/
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i= 0; i<n-1; i++){
            int mini=i;
            for(int j=i+1; j<n; j++){
                if(nums[j]<nums[mini]){
                    mini=j;
                }
            }
            int temp =nums[mini];
            nums[mini]= nums[i];
            nums[i]= temp;

            
        }
    }

    
}

