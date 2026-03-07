class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(String c : s.split("")) {
            if(c.equals(" ")) {
                sb.append(" ");
            } else if (c.matches("[a-z]")) {
                sb.append(Character.toString( ((c.charAt(0) - 'a' + n) % 26) + 'a' ));
            } else {
                sb.append(Character.toString( ((c.charAt(0) - 'A' + n) % 26) + 'A' ));
            }
        }
        
        return sb.toString();
    }
}