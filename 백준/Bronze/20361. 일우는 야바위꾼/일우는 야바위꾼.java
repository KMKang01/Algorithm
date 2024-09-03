import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int X = Integer.parseInt(line.split(" ")[1]);
        int K = Integer.parseInt(line.split(" ")[2]);

        boolean[] cups = new boolean[N];
        cups[X -1] = true;

        for (int i = 0; i < K; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]) - 1;
            int b = Integer.parseInt(s.split(" ")[1]) - 1;
            if (cups[a]) {
                cups[a] = false;
                cups[b] = true;
            } else if (cups[b]) {
                cups[b] = false;
                cups[a] = true;
            }
        }

        int index = 0;
        for (int i = 0; i < cups.length; i++) {
            if (cups[i]) index = i + 1;
        }
        System.out.println(index);
    }
}