class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]= new int[n+m];
        int i=0,j=0;
        int ind = 0;
       // Merge smaller elements first
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[ind] = nums1[i];
                i++;
            } else {
                temp[ind] = nums2[j];
                j++;
            }
            ind++;
        }

        // Copy remaining elements from nums1, if any
        while (i < m) {
            temp[ind] = nums1[i];
            i++;
            ind++;
        }

        // Copy remaining elements from nums2, if any
        while (j < n) {
            temp[ind] = nums2[j];
            j++;
            ind++;
        }
        System.arraycopy(temp, 0, nums1, 0, m + n);
    }
}