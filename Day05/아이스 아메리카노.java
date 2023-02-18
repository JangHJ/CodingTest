class Solution {
    public int[] solution(int money) {
        int count = 0;
        int[] arr = new int[2];
        while(true)
        {
            if(money / 5500 >= 1)
            {
                money -= 5500;
                count++;
            }
            else
                break;
        }
        arr[0] = count;
        arr[1] = money;
        return arr;
    }
}
