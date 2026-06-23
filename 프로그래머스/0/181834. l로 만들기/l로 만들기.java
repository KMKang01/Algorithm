class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(String s : myString.split("")){
            if(s.matches("[a-l]")) sb.append("l");
            else sb.append(s);
        }
        return sb.toString();
    }
}