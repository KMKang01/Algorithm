class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 6 == 0) {
            answer = n / 6;
        } else {
            // n명이 6조각의 피자를 딱 떨어지게 먹어야 함.
            // 4명이 6조각의 피자를 딱 맞게 먹으려면 12조각이 되면 됨.
            // 즉, 피자 조각 % n == 0 이면 됨
            final int PIECE = 6; // 피자 조각 상수
            int count = 1; // 피자 판 수 
            while((PIECE * count) % n != 0){
                count++;
            }
            answer = count;
        }
        
        return answer;
    }
}