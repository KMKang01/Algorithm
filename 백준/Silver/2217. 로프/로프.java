import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] ropes = new int[N];
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);
        for (int i = 0; i < weights.length; i++) {
            int k = ropes[ropes.length - i - 1];
            weights[i] = k * (i + 1);
        }
        Arrays.sort(weights);
        System.out.println(weights[weights.length - 1]);
    }
}