import java.util.*;
class Solution {
    public int solution(int n) {
        double result = Math.sqrt(n); //n의 제곱근
        return result == (int)Math.round(result) ? 1 : 2;
    }
}