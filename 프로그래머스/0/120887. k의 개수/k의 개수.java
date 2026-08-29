class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        while(i <= j) {
            int tmp = i;
            while(tmp > 0) {
                if(tmp % 10 == k) answer++;
                tmp /= 10;
            }
            i++;
        }
        
        return answer;
    }
}