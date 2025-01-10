import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(br.readLine());
            for (int j = 1; j <= a; j++) {
                if (j == 1 || j == a) {
                    for (int k = 0; k < a; k++) {
                        sb.append("#");
                    }
                    sb.append("\n");
                } else {
                    sb.append("#");
                    for (int k = 0; k < a - 2; k++) {
                        sb.append("J");
                    }
                    sb.append("#\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }


}