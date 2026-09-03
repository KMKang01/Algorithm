class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(String s:my_string.split("")) {
            if(s.matches("[0-9]")) {
                sb.append(s);
            } else {
                if(sb.length() > 0) {
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                } 
            }
        }
        if(sb.length() > 0) {
            answer += Integer.parseInt(sb.toString());
            sb.setLength(0);
        } 
        return answer;
    }
}