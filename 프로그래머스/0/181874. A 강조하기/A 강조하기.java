class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        myString = myString.toLowerCase();
        for(String s: myString.split("")) {
            sb.append(s.equals("a") ? s.toUpperCase() : s);
        }
        return sb.toString();
    }
}