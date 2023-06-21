class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(int i=0; i <= n; i++){
            long n2 = (long)Math.pow(i,2);
            if(n2 == n){
                answer = (long)Math.pow(i+1, 2);
                break;
            }
            else if(n2 > n){
                answer = -1;
                break;   
            }
        }
        return answer;
    }
}