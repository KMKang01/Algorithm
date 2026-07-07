import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i = my_string.length() - 1; i >= 0; i-- ) {
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        answer = list.stream().map(i -> (String) i).toArray(String[]::new);
        return answer;
    }
}