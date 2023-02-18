class Solution {
    public int solution(int price) {
       double p = price;
        if(price >= 500000)
            return (int)(p-(p * 0.2));
        else if(price >= 300000)
            return (int)(p-(p * 0.1));
        else if(price >= 100000)
            return (int)(p-(p * 0.05));
        else
            return (int)p;
    }
}
