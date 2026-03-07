class Solution {
    public int[] solution(long n) {
        
        String nStr = Long.toString(n);
        int[] answer = new int[nStr.length()];
        
        int idx = 0;
        while(n > 0) {
            answer[idx++] =(int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}