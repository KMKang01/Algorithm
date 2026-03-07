class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // 음수, 양수 관계없이 사용 가능한 공식
        // (첫항 + 끝항) * (항의 개수) / 2
        if(a == b) {
            answer = a;
        } else if( a < b) {
            answer = (long)(a + b) * (b - a + 1) / 2;    
        } else {
            answer = (long)(a + b) * (a - b + 1) / 2;    
        }
        
        return answer;
    }
}