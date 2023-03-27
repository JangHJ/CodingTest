class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        
        for(int i=0; i<str.length; i++){
            if(str[i].equals(""))
                continue;
            else
                answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}