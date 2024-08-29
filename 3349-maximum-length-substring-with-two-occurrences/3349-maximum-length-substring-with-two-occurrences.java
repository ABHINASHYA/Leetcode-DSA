class Solution {
    public int maximumLengthSubstring(String s) {
        int arr[] = new int[26];
        int l = 0, r=0;
        int n = s.length();
        int maxi = 0;
        while(r<n){
            arr[s.charAt(r) -'a']++;
            while(arr[s.charAt(r)-'a']> 2 && l<r){
                arr[s.charAt(l)-'a']--;
                l++;

            }
            maxi = Math.max(maxi,r-l+1);
            r++;
        }
        return maxi;
    }
}