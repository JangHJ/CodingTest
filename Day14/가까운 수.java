import java.lang.Math;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 101;
        int a = 0;
        int index =0;
        for(int i=0; i<array.length; i++)
        {
            int num = Math.abs(n - array[i]);
            if(num < min)
            {
                index = i;
                min = num;
                a = array[i];
                answer = array[i];
            }
            else if(num == min)
            {
                if(array[i] < a)
                {
                    a= array[i];
                    index = i;
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}