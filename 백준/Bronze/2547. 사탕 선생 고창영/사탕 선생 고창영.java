import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            br.readLine();
            int N = Integer.parseInt(br.readLine());
            BigInteger candies = BigInteger.ZERO;
            for (int j = 0; j < N; j++) {
                candies = candies.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            }
            boolean isPossible = candies.remainder(BigInteger.valueOf(N)).equals(BigInteger.ZERO);
            if(isPossible) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.println(sb.toString().trim());
    }
}