class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(String s: my_string.split("")) {
            sb.append(!s.equals(letter) ? s : "")    ;
        }
        return sb.toString();
    }
}