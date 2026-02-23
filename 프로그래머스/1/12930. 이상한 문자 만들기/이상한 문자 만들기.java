class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            // System.out.println(Character.toString(s.charAt(i)));
            if(Character.toString(s.charAt(i)).equals(" ")) {
                // System.out.println("공백");
                idx = 0;
                sb.append(" ");
            } else {
                if(idx % 2 == 0) sb.append(Character.toString(s.charAt(i)).toUpperCase());
                else sb.append(Character.toString(s.charAt(i)).toLowerCase());
                idx++;
            }
        }
        
        
        
        return sb.toString();
    }
}