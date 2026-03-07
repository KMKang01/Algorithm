import java.io.*;

  public class Main {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();

          int Q = Integer.parseInt(br.readLine());
          for (int i = 0; i < Q; i++) {
              String[] input = br.readLine().split(" ");

              int grade = Integer.parseInt(input[0]);
              int langScore = Integer.parseInt(input[1]);
              int readScore = Integer.parseInt(input[2]);
              int listenScore = Integer.parseInt(input[3]);

              // 조건 1: 1급 또는 2급
              if (grade != 1 && grade != 2) {
                  sb.append("NO\n");
                  continue;
              }

              // 조건 2: 청해 50점 이상
              if (listenScore < 50) {
                  sb.append("NO\n");
                  continue;
              }

              // 조건 3
              int threshold = (grade == 1) ? 100 : 90;

              int count31 = 0; // 3-1 조건 만족 개수
              int count32 = 0; // 3-2 조건 만족 개수

              if (langScore * 3 < threshold) count31++;
              if (langScore <= 21) count32++;

              if (readScore * 3 < threshold) count31++;
              if (readScore <= 21) count32++;

              if (count31 >= 2 || count32 >= 1) {
                  sb.append("YES\n");
              } else {
                  sb.append("NO\n");
              }
          }

          System.out.print(sb.toString());
      }
  }