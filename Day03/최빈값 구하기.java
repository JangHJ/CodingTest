class Solution {
    public int solution(int[] array) {
        int[] arr = new int[1000];
        int count = 0;
        int max = 0;
        
        for(int i=0; i<array.length; i++)
            arr[array[i]]++;
        
        
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j] > count)
            {
                count = arr[j]; //원소 카운트값 예 : 1,1,2,2 경우 arr[1] = 2 
                max = j; //max값보다 arr[j]의 값이 크다면 max에 넣어줌
            }
            else if(arr[j] == count)
            {
                max = -1;
            }
        }
        return max;
    }
}
