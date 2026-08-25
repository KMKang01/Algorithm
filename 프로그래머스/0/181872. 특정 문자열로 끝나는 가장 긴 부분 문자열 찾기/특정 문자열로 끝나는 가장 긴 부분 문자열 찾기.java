import java.util.*;
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = 0;
        for(int i = myString.length() - pat.length(); i > 0; i--) {
            // System.out.println(myString.substring(i, i + pat.length()));
            if(myString.substring(i, i + pat.length()).equals(pat)) {
                idx = i;
                break;
            }
        }
        // System.out.printf("idx = %d", idx);
        answer = myString.substring(0, idx + pat.length());
        return answer;
    }
}