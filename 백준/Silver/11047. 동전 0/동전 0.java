import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int K = Integer.parseInt(line.split(" ")[1]);

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            String ln = br.readLine();
            coins[i] = Integer.parseInt(ln);
        }

        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];
            int tmp = 0;
            if (coin <= K) {
                tmp = K % coin;
                count += (int) Math.floor((double) K / coin);
            } else {
                continue;
            }
            K = tmp;
        }

        System.out.println(count);

    }
}
