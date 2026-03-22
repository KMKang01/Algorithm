class Solution {
    public int solution(int n) {
        int answer = 0;
        // 에라토스테네스의 체 사용
        boolean[] isPrime = new boolean[n+1]; // 0 ~ n까지의 boolean 배열(true: 소수, false: 합성수)
        for(int i = 2 ; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= isPrime.length; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        for(boolean b: isPrime) {
            
            answer = b ? answer + 1 : answer;
        }
        
        return answer;
    }
}