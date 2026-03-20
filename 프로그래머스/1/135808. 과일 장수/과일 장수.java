import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 오름차순 정렬
        // 뒤에서부터 m개씩 묶고 남는 사과는 버림
        for(int j = score.length - 1; j > 0 ; j -= m ) {
            if(j - m + 1 >= 0) {
                
                answer += score[j - m + 1] * m;
            }
        }
        
        
        return answer;
    }
}