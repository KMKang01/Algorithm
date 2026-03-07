import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1) {
            return new int[]{-1};
        } else {
            int min = Integer.MAX_VALUE;
            int idx = 0;

            for(int i = 0; i < arr.length; i++){
                if(min > arr[i]) {
                    min = arr[i];
                    idx = i;
                }
            }
            
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr.length; i++) {
                if(i == idx) {
                    continue;   
                }
                list.add(arr[i]);
            }
            
            answer = new int [list.size()];
            System.out.println(list.size());
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            
        
            return answer;
        }

    }
}