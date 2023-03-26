class Solution {
    public String solution(String polynomial) {
        String str = polynomial.replace(" + ", " ");
        String[] arr = str.split(" ");
        int x=0, c=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x")){
                String temp = arr[i].replace("x", "");
                if(temp == "") x += 1;
                else x += Integer.parseInt(temp);
                System.out.println(temp);
            }
            else c += Integer.parseInt(arr[i]);
        }

        if(c == 0 && x == 0) return "0"; //둘다 0일때
        else if (c >= 1 && x >= 1){
            if(x == 1)
                return "x + " + c;
            else 
                return x + "x + " + c; //둘다 값이 있을 때
        }
        else if(c == 0){
            if(x == 1)
                return "x";
            else
                return x + "x";
        }
        else return c + "";
    }
}