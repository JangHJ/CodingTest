class Solution {
    public int solution(int n, int k) {
        return n*12000 + ( n/10 > 0 ? k-(n/10) : k )*2000;
    }
}
