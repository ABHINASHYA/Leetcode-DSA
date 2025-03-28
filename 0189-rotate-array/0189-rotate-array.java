class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq =new LinkedList<>();
        
        for(int i:nums){
            dq.addLast(i);
        }
        while(k>0){
            int last=dq.peekLast();
            dq.removeLast();
            dq.addFirst(last);
            k--;        
        }
        int i=0;
        while(dq.isEmpty()==false){
            nums[i]=dq.peekFirst();
            dq.removeFirst();
            i++;
        }
        return;
    }
}