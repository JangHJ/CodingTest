import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++)
        {
            String num = Integer.toString(array[i]); //배열 인덱스 i에 위치한 정수를 문자열로 저장 ex) 77 -> "77"
            String[] arr = num.split(""); //문자열을 한글자씩 잘라서 배열에 넣어주기 ex) "77" -> ["7", "7"]
            
            for(int j=0; j<arr.length; j++)
            {
                if(arr[j].equals("7")){ //배열이 "7"과 같다면 count
                    answer++;
                }
            }
        }
        return answer;
    }
}