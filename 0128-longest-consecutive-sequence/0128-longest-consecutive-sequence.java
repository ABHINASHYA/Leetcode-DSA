class Solution {
    public int longestConsecutive(int[]arr) {
        int n = arr.length;   // better app
        if(n == 0) return 0;   // tc = O(n)

        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest =1;
        for(int i=0; i<n; i++){
            if(arr[i]-1 == lastSmaller){
                count++;
                lastSmaller=arr[i];
            }
            else if(arr[i] != lastSmaller){
                count =1;
                lastSmaller= arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}