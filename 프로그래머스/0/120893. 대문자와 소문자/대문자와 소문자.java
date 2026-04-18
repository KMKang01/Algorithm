class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(String s: my_string.split("")) {
            if(s.matches("[a-z]")) sb.append(s.toUpperCase());
            else sb.append(s.toLowerCase());
        }
        return sb.toString();
    }
}