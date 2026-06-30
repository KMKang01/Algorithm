import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++) {
            int tmp = i + n;
            if(tmp > num_list.length - 1) tmp %= num_list.length;
            answer[i] = num_list[tmp];
        }
        
        return answer;
    }
}