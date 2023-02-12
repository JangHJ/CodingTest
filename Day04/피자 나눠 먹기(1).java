class Solution {
    public int solution(int n) {
        int add = n%7==0 ? 0 : 1;
        
        return 7/n + add;
    }
}
