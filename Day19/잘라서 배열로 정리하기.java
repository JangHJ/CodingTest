class Solution {
    public String[] solution(String my_str, int n) {
        int len = 0;
        if(my_str.length() % n == 0)
            len = my_str.length()/n;
        else
            len = my_str.length()/n + 1;
        String[] answer = new String[len];
        int index = 0;
        for(int i=0; i<len; i++)
        {
            if(i == len-1)
                answer[i] = my_str.substring(index);
            else
                answer[i] = my_str.substring(index, index+n);
            index += n;
        }
        return answer;
    }
}