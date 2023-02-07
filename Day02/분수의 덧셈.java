class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = 0, denom = 0;
        int temp = 0;
        
        numer = numer1*denom2 + numer2*denom1; // numer = 1*4 + 3*2 10
        denom = denom1*denom2;  // denom = 2*4 8
        
        if(numer <= denom)
            temp = numer;
        else
            temp = denom;
      
        for(int i = 2; i <= temp; i++)
        {
            if(numer % i == 0 && denom % i == 0)
            {
                while(true)
                {
                    numer = numer / i; 
                    denom = denom / i; 
                    
                    if(numer % i != 0 || denom % i != 0)
                        break;
                }
            }
        }
    
        int[] answer = {numer, denom};
        return answer;
    }
}
