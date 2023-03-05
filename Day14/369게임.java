import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = Integer.toString(order);
        
        for(int i=0; i<s.length(); i++)
        {
            switch(s.charAt(i))
            {
                case '3': case '6': case '9':
                    answer++;
                    break;
                default:
                    break;
            }
        }    
    
        return answer;
                               
    }
}