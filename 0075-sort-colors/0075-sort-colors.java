// class Solution {
//    public void sortColors(int[] nums) {
//        Arrays.sort(nums);  //  tc  O(nlogn)
//    }
// }

/*class Solution {
    public void sortColors(int[] nums) {    /// optimal tc = O(2N)
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
        // tc = O(N^2)
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

    
// class Solution {
//     public void sortColors(int[] arr) {   /// optimal solution

//         int n = arr.length;
//         int low =0,  mid=0, high = n-1;

//         while(mid <= high){    /// tc O(N)
//             if(arr[mid] == 0){
//                 int temp = arr[low];
//                 arr[low] = arr[mid];
//                 arr[mid] = temp;

//                 low++;
//                 mid++;
//             }
//             else if(arr[mid] == 1){
//                 mid++;
//             }
//             else{
//                 int temp = arr[mid];
//                 arr[mid] = arr[high];
//                 arr[high] = temp;

//                 high--;
//             }
//         }
//     }
// }


