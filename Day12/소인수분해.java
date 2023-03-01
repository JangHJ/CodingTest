import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int i =2;
        while(n >= 2)
        {
           if(n%i == 0)
           {
               answer.add(i);
               n /= i;
           }
            else
                i++;
        }
        return answer.stream().distinct().sorted().mapToInt(x->x).toArray();
    }
}