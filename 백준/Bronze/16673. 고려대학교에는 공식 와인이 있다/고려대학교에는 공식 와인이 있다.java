import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int C = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        int P = Integer.parseInt(line[2]);

        int cnt = 0;

        for (int i = 1; i <= C ; i++) {
            cnt += K * i + P * i * i;
        }
        System.out.println(cnt);

    }
}