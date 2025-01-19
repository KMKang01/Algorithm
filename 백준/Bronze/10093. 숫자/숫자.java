import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] line = br.readLine().split(" ");
        long A = Long.parseLong(line[0]);
        long B = Long.parseLong(line[1]);

        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }

        long count = (A == B) ? 0 : B - A - 1;
        sb.append(count).append("\n");

        for (long i = A + 1; i < B; i++) {
            sb.append(i);
            if (i < B - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
