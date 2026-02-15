class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for( ; left <= right; left++) {
            int count = 0;
            for(int i = 1; i <= left; i++){
                if(left % i == 0) count++;
            }
            if(count % 2 == 0) answer += left;
            else answer -= left;
        }
        
        
        return answer;
    }
}