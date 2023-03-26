class Solution {
    public int solution(int[] numbers) {
        int max = -100000000;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i != j){  
                    if(numbers[i] * numbers[j] > max)
                        max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
    }
}