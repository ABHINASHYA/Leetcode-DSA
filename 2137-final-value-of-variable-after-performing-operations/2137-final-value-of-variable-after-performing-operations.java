class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int X=0;
        for(int i=0; i<arr.length; i++){
            String s = arr[i];
            if(s.equals("X++")||s.equals("++X")){
                X++;
            }else{
                X--;
            }
        }
        return X;
    }
}