class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;

        
        int[] cumXor = new int[n];
        cumXor[0] = arr[0];

        
        for (int i = 1; i < n; i++) {
            cumXor[i] = cumXor[i - 1] ^ arr[i];
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            result[i] = cumXor[R] ^ (L == 0 ? 0 : cumXor[L - 1]);
        }
        return result;
    }
}