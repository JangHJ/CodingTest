class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for(int i=1; i<=b; i++){ //기약분수 만들기
            if(a < i || b < i) break;
            else{
                if(a%i == 0 && b%i == 0){
                    a /= i;
                    b /= i;
                }
            }
        }

        int b2 = b; //기약분수 분모 b의 값
        for(int j=2; j<=b2; j++){
            while(b % j == 0){
                if(j == 2 || j == 5) b /= j;
                else{
                    answer = 2;
                    return answer;
                }
            }
            if(b == 1)
                break;
        }
        return answer;
    }
}