class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        //지뢰 표시할 배열
        int [][] board2 =  new int [board.length][board[0].length];
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j] == 1) check(i, j, board2);
            }
        }
        //마지막 for문으로 지뢰 점검
        answer = count(board2);
        return answer;
    }
    public void check(int i, int j, int[][] board2){
        int row = board2.length;
        int col = board2[0].length;
        
        board2[i][j] = 1;
        if(i > 0 && j > 0) board2[i-1][j-1] = 1;            // -1, -1
        if(i > 0) board2[i-1][j] = 1;                       // -1, 0
        if(i > 0 && j < col-1) board2[i-1][j+1] = 1;        // -1, +1
        if(j < col-1) board2[i][j+1] = 1;                   // 0, +1
        if(j > 0) board2[i][j-1] = 1;                       // 0, -1
        if(i < row-1 && j > 0) board2[i+1][j-1] = 1;        // +1, -1
        if(i < row-1) board2[i+1][j] = 1;                   // +1, -1
        if(i < row-1 && j < col-1) board2[i+1][j+1] = 1;    // +1, -1
        // i-1, i+1, j-1, j+1 3개씩 + i, j 2개씩
    }
    public int count(int[][] board2){
        int count = 0;
        for(int i=0; i<board2.length; i++)
        {
            for(int j=0; j<board2[i].length; j++)
            {
                if(board2[i][j] == 0) count++;
            }
        }
        return count;
    }
}