class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        
        for(int i=0; i<len; i++)
        {
            String[] strs = quiz[i].split(" ");
            int num1 = Integer.parseInt(strs[0]);
            int num2 = Integer.parseInt(strs[2]);
            int ans = Integer.parseInt(strs[4]);
            
            switch(strs[1])
            {
                case "+":
                    if((num1 + num2) == ans)
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                    break;
                case "-":
                    if((num1 - num2) == ans)
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                    break;
                default:
                    System.out.println("잘못된 연산자");
                    break;
            }
        }
        return answer;
    }
}