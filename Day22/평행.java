class Solution {
    public double slope(int[] dot1, int[] dot2) {
        //기울기 공식 (y2-y1)==(x2-x1)
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }

    public int solution(int[][] dots) {
        int answer = 0;

		//[a-b, c-d],[a-c, b-d],[a-d, b-c] 4개의 점들로 임의의 두 쌍을 만들었을 때
        if (slope(dots[0], dots[1]) == slope(dots[2], dots[3])) {
            return 1;
        }

        if (slope(dots[0], dots[2]) == slope(dots[1], dots[3])) {
            return 1;
        }

        if (slope(dots[0], dots[3]) == slope(dots[1], dots[2])) {
            return 1;
        }

        return answer;
    }
}