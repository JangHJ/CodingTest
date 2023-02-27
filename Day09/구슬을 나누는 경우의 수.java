class Solution {
    public int sharing(int b, int s)
    {
       if(s == 0 || b == s)
            return 1;
        else
            return sharing(b - 1, s - 1) + sharing(b - 1, s); 
    }
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = sharing(balls, share);
        return answer;
    }
}
