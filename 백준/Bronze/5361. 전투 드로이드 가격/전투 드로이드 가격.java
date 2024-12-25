import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    static double BlasterRifle = 350.34;
    static double WatchingSensor = 230.90;
    static double ListeningSensor = 190.55;
    static double Arm = 125.30;
    static double Leg = 180.90;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N ; i++) {
            String [] line = br.readLine().split(" ");
            double sum  = 0;
            sum += Double.parseDouble(line[0]) * BlasterRifle;
            sum += Double.parseDouble(line[1]) * WatchingSensor;
            sum += Double.parseDouble(line[2]) * ListeningSensor;
            sum += Double.parseDouble(line[3]) * Arm;
            sum += Double.parseDouble(line[4]) * Leg;
            System.out.printf("$%.2f\n", sum);
        }
    }
}