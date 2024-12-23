import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < N ; i++) {
            String [] line = br.readLine().split(" ");
            int A = Integer.parseInt(line[0]);
            int B = Integer.parseInt(line[1]);

            if(A > B) aCount++;
            else if ( A < B) bCount++;
        }

        System.out.printf("%d %d", aCount, bCount);
    }
}