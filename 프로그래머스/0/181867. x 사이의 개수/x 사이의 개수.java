import java.util.*;
class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i< myString.length(); i++){
            
            if(myString.charAt(i) == 'x') {
                list.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        list.add(count);
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}