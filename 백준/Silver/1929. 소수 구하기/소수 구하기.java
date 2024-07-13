import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]); // 문서 개수
        int M = Integer.parseInt(line.split(" ")[1]); // M번쨰 문서는 언제 출력되는지?

        boolean [] isPrime = new boolean[M + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= M; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= M; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = N; i <= M; i++) {
            if (isPrime[i]) sb.append(i).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}


