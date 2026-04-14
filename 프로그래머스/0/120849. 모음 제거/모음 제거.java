class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(String s: my_string.split("")){
            switch(s) {
                case "a", "e", "i", "o", "u":
                    break;
                default:
                    sb.append(s);
            }
        }
        return sb.toString();
    }
}