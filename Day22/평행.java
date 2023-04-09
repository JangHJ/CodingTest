import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

class Solution {
	public int solution(int[][] dots) {
		int answer = 0;
		ArrayList<Double> slopes = new ArrayList<>();

		for (int i = 0; i < dots.length-1; i++) { //0~1
			for (int j = i+1; j < dots.length; j++) { //1~2

				double y = dots[i][1] - dots[j][1]; //y값의 증가량
				double x = dots[i][0] - dots[j][0]; //x값의 증가량

				double slop = Math.abs(y/x); // 기울기 공식

				if (!slopes.contains(slop)) slopes.add(slop);
                else return 1;
			}
		}
		return answer;
	}
}