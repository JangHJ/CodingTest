class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        boolean id=false;
        boolean pw=false;
        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0]) == true){ //아이디가 맞을 때
                if(db[i][1].equals(id_pw[1]) == true){
                    id = true;
                    pw = true;
                }else
                    id = true;
            }
        }
        if(id == true && pw == true){
            answer = "login"; 
        }else if(id == true && pw == false){
            answer = "wrong pw";
        }
        
        return answer;
    }
}