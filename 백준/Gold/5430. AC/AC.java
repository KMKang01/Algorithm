import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int countD = 0;
        boolean isFront = true; // true이면 앞에서 지우고, false이면 뒤에서 지운다.

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String cmd = br.readLine(); // 함수

            StringTokenizer st = new StringTokenizer(cmd, "D", true); // D를 기준으로 자르고 D도 반환

            int arrSize = Integer.parseInt(br.readLine()); // 배열 길이
            String line2 = br.readLine();
            String[] arr = line2.substring(1, line2.length() - 1).split(","); // 주어진 배열
            Deque<String> stack = new ArrayDeque<>(List.of(arr)); // 주어진 배열을 deque에 저장

            // D 개수 검출
            String[] arrayD = cmd.split("R");
            for (String s : arrayD) {
                countD += s.length();
            }

            if (countD > arrSize) {
                sb1.append("error\n");
                countD = 0;
                continue;
            }

            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                if (s.equals("D")) { // 이번 토큰이 D이면
                    // 지우기
                    if (isFront) stack.removeFirst();
                    else stack.removeLast();
                } else { // 이번 토큰이 R 문자열이면
                    int length = s.length();
                    if (length % 2 != 0) { // 길이가 짝수이면 위치 변화 X, 홀수이면 위치 변화 O
                        isFront = !isFront;
                    }
                }
            }

            // 종료됐을 때, isFront가 true이면 정방향 false면 역방향

            // 역방향인 경우
            if (!isFront) {
                sb1.append("[");
                if(!stack.isEmpty()){
                    while(!stack.isEmpty()) {
                        sb1.append(stack.removeLast()).append(",");
                    }
                    sb1.deleteCharAt(sb1.length() - 1);
                }
                sb1.append("]\n");
            } else { // 정방향인 경우
                sb1.append("[");
                if(!stack.isEmpty()){
                    for (String s : stack) {
                        sb1.append(s).append(",");
                    }
                    sb1.deleteCharAt(sb1.length() - 1);
                }
                sb1.append("]\n");
            }
            // 초기화
            countD = 0;
            isFront = true;
        }
        System.out.println(sb1.toString().trim());
    }

}

