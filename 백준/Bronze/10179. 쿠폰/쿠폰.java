import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            double a = Double.parseDouble(br.readLine());
            System.out.printf("$%.2f\n", a *0.8);
        }


    }
}