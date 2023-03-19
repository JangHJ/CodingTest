class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        
        for (String s : num.split("")) {
            int temp = Integer.parseInt(s);
            answer += temp;
        }
        return answer;
    }
}