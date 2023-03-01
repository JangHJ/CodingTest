import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int c = 0;
        for(int i=0; i < my_string.length(); i++)
        {
            String str = String.valueOf(my_string.charAt(i));  
            int num = my_string.charAt(i);
            if(num <= 57 && num >= 48)
                answer.add(Integer.parseInt(str));
        }
        int[] a = answer.stream().mapToInt(i->i).toArray();
        Arrays.sort(a);
        return a;
    }
}