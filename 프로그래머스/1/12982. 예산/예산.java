import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int count = 0;
        for(int i : d){
            if(budget >= i){
                budget -= i;
                count++;
            } else {
                break;
            }
        }
        
        return count;


        
    }
}