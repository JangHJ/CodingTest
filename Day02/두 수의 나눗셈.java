class Solution {
    public int solution(int num1, int num2) {
        double temp = 0;
        int answer = 0;
        temp = num1 / (double)num2;
        answer = (int) (temp * 1000);
        return answer;
    }
}
