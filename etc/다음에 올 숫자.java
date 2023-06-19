class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num = 0;
        
        //등차수열
        if(common[1] - common[0] == common[2] - common[1]){
            num = common[1] - common[0];
            answer = common[common.length - 1] + num;
        }//등비수열
        else{
            num = common[1] / common[0];
            answer = common[common.length - 1] * num;
        }
        
        return answer;
    }
}