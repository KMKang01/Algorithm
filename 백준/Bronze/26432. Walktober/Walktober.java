import java.io.*;

  public class Main {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();

          int T = Integer.parseInt(br.readLine());

          for (int tc = 1; tc <= T; tc++) {
              String[] input = br.readLine().split(" ");
              int M = Integer.parseInt(input[0]); // 참가자 수
              int N = Integer.parseInt(input[1]); // 일수
              int P = Integer.parseInt(input[2]); // John의 ID (1-indexed)

              // 스코어보드 입력
              int[][] scoreboard = new int[M + 1][N]; // 1-indexed
              for (int i = 1; i <= M; i++) {
                  String[] steps = br.readLine().split(" ");
                  for (int j = 0; j < N; j++) {
                      scoreboard[i][j] = Integer.parseInt(steps[j]);
                  }
              }

              // 각 날짜마다 필요한 추가 걸음 수 계산
              int totalAdditional = 0;
              for (int day = 0; day < N; day++) {
                  // 해당 날짜의 최대 걸음 수 찾기
                  int maxSteps = 0;
                  for (int i = 1; i <= M; i++) {
                      maxSteps = Math.max(maxSteps, scoreboard[i][day]);
                  }

                  // John이 최대보다 적으면 차이만큼 추가 필요
                  int johnSteps = scoreboard[P][day];
                  if (johnSteps < maxSteps) {
                      totalAdditional += (maxSteps - johnSteps);
                  }
              }

              sb.append("Case #").append(tc).append(": ").append(totalAdditional).append("\n");
          }

          System.out.print(sb.toString());
      }
  }