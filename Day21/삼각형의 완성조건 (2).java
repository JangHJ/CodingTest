class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int min = 1001;
        int answer = 0;

        for(int i=0; i<sides.length; i++){
            if(max < sides[i]) max = sides[i];
            if(min > sides[i]) min = sides[i];
        }
        //배열 중 원소 하나가 가장 긴 변이라고 할 때
        for(int i = (max-min)+1; i <=max; i++)
            answer++;

        //나머지 한 변이 긴 변일 때
        for(int i = max+1; i < max+min; i++)
            answer++;

        return answer;
    }
}