class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int countMax = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int countOnes = mat[i][0];
            for (int j = 1; j < m; j++) {
                mat[i][j] += countOnes;
                countOnes = mat[i][j];
            }
            if (countOnes > countMax) {
                countMax = countOnes;
                index = i;
            }
        }
        return new int[]{index, countMax};
    }
}
