class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        k = k % nums.length;
        for(int i=nums.length-k; i<nums.length; i++){
           arr1.add(nums[i]);
        }
        for(int i=0; i<nums.length-k; i++){
           arr1.add(nums[i]);
        }
        for(int i=0; i<arr1.size(); i++){
           nums[i]= arr1.get(i);
        }
        // return arr1;
    }
}