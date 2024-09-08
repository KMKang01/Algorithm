import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int [5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            while(st.hasMoreTokens()) {
                result += Integer.parseInt(st.nextToken());
            }
            arr[i] = result;
        }
        int max = 0;
        int idx = 0;
        for(int i = 0; i < 5; i++){
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        System.out.printf("%d %d\n", idx+1, max);
    }
}