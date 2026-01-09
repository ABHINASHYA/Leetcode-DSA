class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        // To handle subarray starting from index 0
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            prefixSum += (arr[i] == 0) ? -1 : 1;

            if (map.containsKey(prefixSum)) {
                int length = i - map.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}