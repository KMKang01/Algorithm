import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String [] arr = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(String s : arr) if(!s.equals("")) list.add(s);
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}