class Solution {
    public int candy(int[] rat) {
       int n = rat.length;
       int left[]= new int[n];
       int right[]= new int[n];
       for(int i=0; i<n; i++){
        if(i>0 && rat[i]>rat[i-1]){
            left[i] = left[i-1]+1;
        }
        else{
            left[i]=1;
        }
       }
        for(int i=n-1; i>=0; i--){
        if(i<n-1 && rat[i]>rat[i+1]){
            right[i] = right[i+1]+1;
        }
        else{
            right[i]=1;
        }
       }
       int ans =0;
       for(int i=0; i<n; i++){
        ans = ans+Math.max(left[i],right[i]);
       } 
       return ans;
    }
}