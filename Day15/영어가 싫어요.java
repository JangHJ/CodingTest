class Solution {
    public long solution(String numbers) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String answer = "";
        String temp = "";
        
        for(int i=0; i<numbers.length(); i++)
        {
            temp += numbers.charAt(i);
            for(int j=0; j<num.length; j++)
            {
                if(temp.equals(num[j]))
                {
                    answer += String.valueOf(j);
                    temp = "";
                }
            }
        } 
        return Long.parseLong(answer);
    }
}