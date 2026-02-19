import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int x = 0; x < commands.length; x++) {
            int i = commands[x][0] - 1;
            int j = commands[x][1] - 1;
            int k = commands[x][2] - 1;
            
            ArrayList<Integer> list = new ArrayList<>();
            for( ; i <= j ; i++) {
                list.add(array[i]);
            }
            Collections.sort(list);
            answer[x] = list.get(k);
        }
        
        return answer;
    }
}