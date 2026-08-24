import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                int j = arr[i];
                while(j > 0) {
                    list.removeLast();
                    j--;
                }
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}