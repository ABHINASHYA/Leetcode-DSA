class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double min = salary[0];
        double max = salary[salary.length-1];
        double sum =0.0;

        for(int i=1; i< salary.length -1; i++){
            sum = sum + salary[i];
        }
        sum /= (salary.length -2);
        return sum;
    }
}