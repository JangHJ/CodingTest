import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] letterArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        
        for(int i =0; i<letterArr.length; i++)
        {
            for(int j=0; j<morse.length; j++)
            {
                if(letterArr[i].equals(morse[j]))
                    answer += Character.toString(j+97);
            }
        }
        return answer;//Arrays.toString(letterArr);
    }
}
