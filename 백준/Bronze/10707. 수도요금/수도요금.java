import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int chargeX = A * P;
        int chargeY = 0;

        if (C < P) {
            chargeY = B + (P - C) * D;
        } else {
            chargeY = B;
        }
        System.out.println(Math.min(chargeX, chargeY));
    }


}