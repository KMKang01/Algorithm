import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n - 1 < num_list.length) {
            list.add(num_list[n-1]);
            n++;
        }
        
        answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}