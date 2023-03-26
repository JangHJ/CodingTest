class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x=0, y=0;
        
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "left":
                    x -= 1;
                    if(board[0] / 2 < Math.abs(x)) x += 1;
                    break;
                case "right":
                    x += 1;
                    if(board[0] / 2 < Math.abs(x)) x -= 1;
                    break;
                case "up":
                    y += 1;
                    if(board[1] / 2 < Math.abs(y)) y -= 1;
                    break;
                case "down":
                     y -= 1;
                    if(board[1] / 2 < Math.abs(y)) y += 1;
                    break;
            }
        }
        if(board[0] / 2 < Math.abs(x)){
            if(x < 0)
                x = (board[0] / 2) * -1;
            else
                x = board[0] / 2;
            answer[0] = x;
        }
        else
            answer[0] = x;
        //
        if(board[1] / 2 < Math.abs(y)){
            if(y < 0)
                y = (board[1] / 2) * -1;
            else
                y = board[1] / 2;
            answer[1] = y;
        }
        else
            answer[1] = y;
        //
        return answer;
    }
}