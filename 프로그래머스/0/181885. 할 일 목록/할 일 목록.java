import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<todo_list.length; i++) {
            if(!finished[i]) list.add(todo_list[i]);
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}