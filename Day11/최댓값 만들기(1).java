class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        
        for(int i=0; i<len; i++)
        {
            for(int k=0; k<len; k++)
            {
                if(k != i) //같은 원소끼리 곱한 값은 들어가면 안되므로
                {
                    if(numbers[i]*numbers[k] > answer)
                        answer = numbers[i]*numbers[k];
                }
            }
        }
        return answer;
    }
}