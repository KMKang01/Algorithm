import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < names.length; i += 5) {
            list.add(names[i]);
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}