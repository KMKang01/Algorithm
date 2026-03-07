class Solution {
    public int solution(int num) {
        long tmp = (long) num;
        int answer = 0;
        if(num == 1) return 0;
        while(tmp != 1) {
            if(tmp % 2 == 0) {
                tmp /= 2;
            } else {
                tmp = tmp * 3 + 1;
            }
            answer++;
            if(answer == 500) return -1;
        }
        
        return answer;
    }
}