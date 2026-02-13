class Solution {
    public int solution(String s) {
        int answer = 0;
        int prev = 0;
        for(String ch : s.split(" ")){
            if (ch.equals("Z")) {
                answer -= prev;
                prev = 0;
            } else {
                prev = Integer.parseInt(ch);
                answer += prev;
            } 
        }
        
        return answer;
    }
}