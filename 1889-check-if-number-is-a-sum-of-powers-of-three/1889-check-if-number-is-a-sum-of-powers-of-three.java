class Solution {
    public boolean checkPowersOfThree(int n) {
        int cap=16; // The upper limit for powers of three, as 3^15 is a large number
        int[] arr=new int[cap];

        for(int i=0; i<cap; i++){
            arr[i]=(int)Math.pow(3,i);
        }
        for(int i=cap-1; i>=0; i--){
            if(n>=arr[i]){
                n-=arr[i];
            }          
            if(n==0){
                return true;
            }
        }

        return false;
    }
}