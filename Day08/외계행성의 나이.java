import java.util.stream.*;

class Solution {
    public String solution(int age) {
        String a =Integer.toString(age);
        String answer = "";
        
        for(int i=0; i<a.length(); i++)
        {
            answer += (char)((int)a.charAt(i) + 49);
        }
        
        return answer;
    }
}
