import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        answer = new int [score.length];
        
        ArrayList<Integer> dailyRank = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            if(dailyRank.size() < k) {
                dailyRank.add(score[i]);
                Collections.sort(dailyRank);
            } else {
                if(dailyRank.get(0) < score[i]) {
                    dailyRank.remove(0);
                    dailyRank.add(score[i]);
                    Collections.sort(dailyRank);
                }
            }
            answer[i] = dailyRank.get(0);
        }
        
        
        return answer;
    }
}