import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(String s: my_string.split("")) if(s.matches("[0-9]")) list.add(Integer.parseInt(s));
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}