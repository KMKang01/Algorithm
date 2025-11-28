  import java.io.*;
  import java.util.*;

  public class Main {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new
  InputStreamReader(System.in));

          int N = Integer.parseInt(br.readLine());

          if (200 <= N && N <= 205) {
              System.out.println(1);
          } else if ( 206 <= N && N  <= 217) {
              System.out.println(2);
          } else if ( 218 <= N && N  <= 228) {
              System.out.println(3);
          } else {
              System.out.println(4);
          }
      }
  }