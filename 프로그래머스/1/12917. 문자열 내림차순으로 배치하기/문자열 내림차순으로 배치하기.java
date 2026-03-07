import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        String []sArr = s.split("");
        for(String ch : sArr) {
            list.add(ch);
        }

        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for(String ch : list) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}