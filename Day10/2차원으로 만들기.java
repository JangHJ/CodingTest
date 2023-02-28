import java.util.Arrays;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length/n;
        int[][] answer = new int[len][n];
        int cnt=0;
        
        for(int i=0; i<len; i++)
        {    
            for(int j=0; j<n; j++)
            {
                answer[i][j] = num_list[cnt++];
            }
        }
        return answer;
    }
}
