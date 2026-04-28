import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++) if(i % 2 == 1) list.add(i);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}