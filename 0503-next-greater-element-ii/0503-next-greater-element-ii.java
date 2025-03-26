class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st =new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(st.isEmpty() == false){
                int top = st.peek();
                if(top>nums[i]){
                    ans[i]=top;
                    break;
                }
                else{
                    st.pop();
                }
            }
            st.push(nums[i]);
        }
        for(int i=n-1; i>=0; i--){
            while(st.isEmpty() == false){
                int top = st.peek();
                if(top>nums[i]){
                    ans[i]=top;
                    break;
                }
                else{
                    st.pop();
                }
            }
            st.push(nums[i]);
        }
        return ans;
    }
}