class Solution {
    static void helper(char[] arr, int l, int r){
        if(l>=r){
            return;
        }
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        helper(arr, l+1, r-1);
    }
    public void reverseString(char[] s) {
        helper(s, 0, s.length-1);
    }
}