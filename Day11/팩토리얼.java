class Solution {
    public int solution(int n) {
        int sum = 1;
        
        for(int i = 1; i < 10; i++)
        {
            if(n == 1)
                return 1;
            sum *= i;
            if(sum > n)
                return i-1;
        }
        return 10;
    }
}