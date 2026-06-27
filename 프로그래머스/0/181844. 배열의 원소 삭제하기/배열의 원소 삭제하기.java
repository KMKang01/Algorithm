import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int a: arr) {
            boolean flag = true;
            for(int b: delete_list) {
                if(a==b) {
                    flag = false;
                }
            }
            if(flag) list.add(a);
        }
        answer = list.stream().mapToInt(i -> (int) i).toArray();
        return answer;
    }
}