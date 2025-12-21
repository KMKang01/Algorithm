  import java.io.*;

  public class Main {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          int[] res = new int[6];

          for (int i = 0; i < 6; i++) {
              String line = br.readLine();
              // rstrip() 처럼 오른쪽 공백 제거
              line = line.replaceAll("\\s+$", "");
              res[i] = line.length();
          }

          System.out.println("Latitude " + res[0] + ":" + res[1] + ":" + res[2]);
          System.out.println("Longitude " + res[3] + ":" + res[4] + ":" + res[5]);
      }
  }
