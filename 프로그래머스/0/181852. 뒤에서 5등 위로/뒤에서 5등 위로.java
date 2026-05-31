import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = new int[num_list.length - 5];
        for(int i = 0; i < num_list.length - 5; i++) {
            answer[i] = num_list[i +5];
        }
        return answer;
    }
}