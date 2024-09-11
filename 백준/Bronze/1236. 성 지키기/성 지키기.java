import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int M = Integer.parseInt(line.split(" ")[1]);

        boolean[] check1 = new boolean[N];
        boolean[] check2 = new boolean[M];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                if (input[j].equals("X")) {
                    check1[i] = true;
                    check2[j] = true;
                }
            }
        }

        int rowCount = 0;
        for (int i = 0; i < N; i++) {
            if (!check1[i]) {
                rowCount++;
            }
        }

        int colCount = 0;
        for (int j = 0; j < M; j++) {
            if (!check2[j]) {
                colCount++;
            }
        }

        System.out.println(Math.max(rowCount, colCount));
    }
}