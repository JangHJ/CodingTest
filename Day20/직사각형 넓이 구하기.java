import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int x1 = -256, x2 = 256, y1 = -256, y2 = 256;
        for(int i=0; i<4; i++){
            if(x1 < dots[i][0]) x1 = dots[i][0]; //x좌표 max값
            if(x2 > dots[i][0]) x2 = dots[i][0]; //x좌표 min값
        }
        for(int i=0; i<4; i++){
            if(y1 < dots[i][1]) y1 = dots[i][1]; //y좌표 max값
            if(y2 > dots[i][1]) y2 = dots[i][1]; //y좌표 min값
        }
        return (x1 - x2)*(y1 - y2);
    }
}