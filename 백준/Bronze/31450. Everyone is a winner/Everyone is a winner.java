import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int M = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        if( M % K == 0) System.out.printf("Yes");
        else System.out.printf("No");

    }
}