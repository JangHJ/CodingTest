import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answers = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++)
        {
            if(i%2 != 0)
                answers.add(i); 
        }
        
        return answers;
    }
}
