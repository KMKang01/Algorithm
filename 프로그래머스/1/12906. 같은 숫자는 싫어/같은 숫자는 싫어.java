import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int prev = -1;
        for(int num : arr) {
            if(num == prev) continue;
            else {
                prev = num;
                list.add(num);
            }
        }
        
        // System.out.println(list.toString());
        answer = new int [list.size()];
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}