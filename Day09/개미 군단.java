class Solution {
    public int solution(int hp) {
        int answer = 0;
        if(hp / 5 > 0)
        {
            answer += hp / 5;
            hp -= (hp/5)*5;
        }
        if(hp / 3 > 0)
        {
            answer += hp / 3;
            hp -= (hp/3)*3;
        }
        if(hp / 1 > 0)
        {
            answer += hp;
            hp = 0;
            return answer;
        }
        else
            return answer;
            
    }
}
