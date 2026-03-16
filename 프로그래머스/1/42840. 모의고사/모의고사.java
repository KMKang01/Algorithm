import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
            switch(i % 5) {
                case 0: s1 = answers[i] == 1 ? s1 + 1 : s1; break;
                case 1: s1 = answers[i] == 2 ? s1 + 1 : s1; break;
                case 2: s1 = answers[i] == 3 ? s1 + 1 : s1; break;
                case 3: s1 = answers[i] == 4 ? s1 + 1 : s1; break;
                case 4: s1 = answers[i] == 5 ? s1 + 1 : s1; break;
            }
            
            switch(i % 8) {
                case 0, 2, 4, 6: s2 = answers[i] == 2 ? s2 + 1 : s2; break;
                case 1: s2 = answers[i] == 1 ? s2 + 1 : s2; break;
                case 3: s2 = answers[i] == 3 ? s2 + 1 : s2; break;
                case 5: s2 = answers[i] == 4 ? s2 + 1 : s2; break;
                case 7: s2 = answers[i] == 5 ? s2 + 1 : s2; break;
            }
            
            switch(i % 10) {
                case 0, 1: s3 = answers[i] == 3 ? s3 + 1 : s3; break;
                case 2, 3: s3 = answers[i] == 1 ? s3 + 1 : s3; break;
                case 4, 5: s3 = answers[i] == 2 ? s3 + 1 : s3; break;
                case 6, 7: s3 = answers[i] == 4 ? s3 + 1 : s3; break;
                case 8, 9: s3 = answers[i] == 5 ? s3 + 1 : s3; break;
            }
        }
        
        int max = Math.max(Math.max(s1, s2), s3);
        ArrayList<Integer> list = new ArrayList<>();
        if(max == s1) list.add(1);
        if(max == s2) list.add(2);
        if(max == s3) list.add(3);
        
        answer = new int [list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}