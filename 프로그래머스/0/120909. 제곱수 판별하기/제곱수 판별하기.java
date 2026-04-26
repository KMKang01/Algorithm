class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= (int) Math.sqrt(n); i++) {
            if(i * i == n) answer = 1;
        }
        
        return answer == 1 ? 1:2;
    }
}