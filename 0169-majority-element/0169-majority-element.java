// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {   //tc = O(n*n)
        int n = nums.length;
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(nums[j] == nums[i])
                count++;
            }
            if(count> n/2) return nums[i];
        }
        return -1;
    }
}

/*class Solution {
    public int majorityElement(int[] nums) {   //tc = O(2*n)
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
}*/

//optimal approch
// O(N)

// class Solution {
//     public int majorityElement(int[] nums) {
//        int n = nums.length;
//         int count = 0; 
//         int element = 0; 

//         for (int i = 0; i < n; i++) {
//             if (count == 0) {
//                 count = 1;
//                 element = nums[i];
//             } else if (element == nums[i]) count++;
//             else count--;
//         }

//         //checking if the stored element
//         // is the majority element:
//         int count1 = 0;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] == element) count1++;
//         }

//         if (count1 > (n / 2)) return element;
//         return -1;
//     }
// }