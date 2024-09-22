class Solution {
    public int findKthNumber(int n, int k) {
        long curr = 1;
        k-=1;
        while(k>0){
            long steps = getNoSteps(n, curr);
            if(steps<=k){
                curr+=1;
                k-=steps;
            } else {
                curr*=10;
                k-=1;
            }
        }
        return (int)curr;
    }
    private long getNoSteps(long n, long curr){
        long next = curr+1;
        long steps = 0;
        
        while(curr<=n){
            if(next<=n){
                steps+=next-curr;
            } else{
                steps+=(n-curr+1);
            }
            curr*=10;
            next*=10;
        }
        return steps;
    }
}