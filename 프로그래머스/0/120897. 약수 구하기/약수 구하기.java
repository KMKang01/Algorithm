import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n;i++) {
            if(n % i == 0) list.add(i);
        }
        answer = list.stream()
                .mapToInt(Integer::intValue) // 혹은 .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}