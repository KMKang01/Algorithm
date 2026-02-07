class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int digitsSum = 0;
        while(tmp > 0) {
            digitsSum += tmp % 10;
            tmp /= 10;
        }
        answer = x % digitsSum == 0;
        
        return answer;
    }
}