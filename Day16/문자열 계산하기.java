class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String oper = "+";
        String[] operNum = my_string.split(" ");
        int num = 0;
	    int num2 = Integer.parseInt(operNum[2]);
        
        for(int i=0; i<operNum.length; i++)
        {
            if(i % 2 == 1)
                oper = operNum[i];
            else{
                num = Integer.parseInt(operNum[i]);
                if(oper.equals("+"))
                    answer += num;
                else
                    answer -= num;
            }
        }
        
        return answer;
    }
}