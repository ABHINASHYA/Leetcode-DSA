class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int n=nums.length; //first method
        // Arrays.sort(nums);
        // int index=n-k;
        // return nums[index];

       
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}