class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int count = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result[j++] = i;
            }
        }
        // Convert int[] to List<Integer>
        List<Integer> resultList = new ArrayList<>();
        for (int num : result) {
            resultList.add(num);
        }
        return resultList;


    }
}