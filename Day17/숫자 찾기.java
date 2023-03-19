import java.lang.Math;

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int len = (int)(Math.log10(num)+1);
        for(int i=1; i<=len; i++){
            int temp = (int)(Math.pow(10, len-i));
            if(num/temp == k){
                answer = i;
                break;
            }
            else
                num = num % temp;
        }
        return answer;
    }
}