import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int T = Integer.parseInt(br.readLine());
         int [] atmQueue = new int[T];
         StringTokenizer st = new StringTokenizer(br.readLine());
         int answer = 0;

         int i = 0;
         while(st.hasMoreTokens()) {
             atmQueue[i] = Integer.parseInt(st.nextToken());
             i++;
         }

         Arrays.sort(atmQueue);

         int waited = 0;
         for(int time : atmQueue){
             answer = answer + waited + time;
             waited += time;
         }

         System.out.println(answer);
     }
}