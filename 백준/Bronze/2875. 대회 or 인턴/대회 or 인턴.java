import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int K = Integer.parseInt(line[2]);

        int teams = 0;

        while(K > 0) {
            if (N > 2 * M) {
                N--;
                K--;
            } else {
                M--;
                K--;
            }
        }

        while((N-2 ) >= 0 &&  (M-1) >= 0){
            N -=2 ;
            M--;
            teams++;
        }
        System.out.println(teams);
    }


} 