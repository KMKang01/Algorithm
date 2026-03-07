class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n <= 3) {
            return 0;
        } else {
            int count = 0;
            for(int i = 4; i <= n ; i++) {
                boolean isPrime = true;
                for(int j = 2; j * j <= i ; j++){
                    if(i % j == 0) {
                       isPrime = false;
                       break;
                    }
                }
                count = isPrime ? count+1 : count;
            }
            answer = n - 3 - count;
        }
        
        
        return answer;
    }
}