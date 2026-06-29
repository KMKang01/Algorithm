import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String [] arr = myString.split("x");
        Arrays.sort(arr);
        ArrayList<String> list = new ArrayList<>();
        for(String s: arr) {
            if(!s.isEmpty()) list.add(s);
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}