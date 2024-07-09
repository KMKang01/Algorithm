import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        short[] arr = new short[T];

        for (int i = 0; i < T; i++) {
            arr[i] = Short.parseShort(br.readLine());

        }

        Arrays.sort(arr);

        for(short s : arr){
            sb.append(s).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}
