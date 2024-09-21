class Solution {
    public List<Integer> lexicalOrder(int n) {
        Integer[] nums = new Integer[n];
        for(int i=0; i<n; i++){
            nums[i]= i+1;
        }

        Arrays .sort(nums,(a,b)-> (""+a).compareTo (""+b));
        List < Integer > ans = new ArrayList<>();
            for ( int num :nums){
                ans .add (num);

            }
        return ans;
    }
}