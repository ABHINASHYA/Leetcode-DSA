class Solution {
    public int findSumDivisior(int num){
        int divisior = 0;
        int sum = 0;
        for(int fact=1; fact*fact<=num; fact++){
            if(num%fact == 0){
                int other = num/fact;
                if(other == fact){
                    divisior += 1;
                    sum += fact;
                }else{
                    divisior +=2;
                    sum += (fact+other);
                }
            }
            if(divisior>4){
                return 0;
                
            }
        }
        return divisior == 4?sum:0;
    }
    public int sumFourDivisors(int[] nums) {
        int result =0;

        for(int num:nums){
            result += findSumDivisior(num);
        }
        return result;
    }
}