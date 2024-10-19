// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }

/*class Solution {
    public int majorityElement(int[] nums) {   //tc = O(n*n)
        int n = nums.length;
        for(int  i=0; i<n; i++ ){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j] == nums[i])
                count++;
            }
            if(count > n/2) return nums[i];
        }
        return -1;
    }
}*/

class Solution {
    public int majorityElement(int[] nums) {   //tc = O(n*n)
        int n = nums.length;
        
        HashMap<Integer, Integer> mpp =new HashMap<>();

        for(int i=0; i<n; i++){
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
}