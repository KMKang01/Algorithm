import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        // 각 스테이지에 멈춰있는 사람 수 (인덱스 1~N 사용, 크기 N+2)
        int[] stuckCount = new int[N + 2];
        for (int s : stages) {
            stuckCount[s]++;
        }

        double[] failureRate = new double[N + 1]; // 인덱스 1~N 사용
        int reached = stages.length; // 1번 스테이지에 도달한 사람 = 전체

        for (int i = 1; i <= N; i++) {
            if (reached == 0) {
                failureRate[i] = 0;
            } else {
                failureRate[i] = (double) stuckCount[i] / reached;
                reached -= stuckCount[i]; // 다음 스테이지 도달자 수 = 현재 - 여기서 멈춘 사람
            }
        }

        // 스테이지 번호 배열 생성 후 실패율 내림차순 정렬
        Integer[] stageNums = new Integer[N];
        for (int i = 0; i < N; i++) stageNums[i] = i + 1;

        Arrays.sort(stageNums, (a, b) -> {
            if (failureRate[b] == failureRate[a]) return a - b; // 실패율 같으면 번호 오름차순
            return Double.compare(failureRate[b], failureRate[a]); // 실패율 내림차순
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) answer[i] = stageNums[i];
        return answer;
    }
}