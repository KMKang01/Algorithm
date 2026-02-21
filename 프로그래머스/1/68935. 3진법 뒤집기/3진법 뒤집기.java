class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        String [] threes = sb.toString().split("");
        for(int i = 0; i < sb.length(); i++) {
            answer += (int) Math.pow(3, i) * Integer.parseInt(threes[sb.length() - i - 1]);
        }
        
        
        return answer;
    }
}