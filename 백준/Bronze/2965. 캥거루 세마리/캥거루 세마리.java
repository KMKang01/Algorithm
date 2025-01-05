import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);
        int C = Integer.parseInt(line[2]);

        int result = Math.max(B-A, C-B) - 1;
        System.out.println(result);
    }
}