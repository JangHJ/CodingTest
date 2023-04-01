class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int[] check = new int[dic.length];

        for(int i=0; i<spell.length; i++){
            for(int j=0; j<dic.length; j++){
                if(dic[j].contains(spell[i]))
                    check[j]++;
            }
        }

        for(int i=0; i<check.length; i++){
            if(check[i] == spell.length)
                answer++;
        }
        return answer > 0 ? 1 : 2;
    }
}