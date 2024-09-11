class Solution {
    public boolean isPowerOfTwo(int n) {
     /*   if(n<=0) return false;

        if(n==1) return true;

        if(n%2 == 1) return false;
    
     return isPowerOfTwo(n/2);
     */

     /// Bit manupulation

     if(n<=0) return false;
     int cnt = 0;
     for(int i=0; i<32; i++){
        if((n&(1 << i)) > 0) cnt ++;
     }
     return cnt == 1;

    }

}