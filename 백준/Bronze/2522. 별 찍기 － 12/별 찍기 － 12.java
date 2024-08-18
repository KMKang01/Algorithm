import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < 2 *N -1 ; i++) {
            if(i< N){
                for (int j = i; j < N - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = N; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < 2 * N - 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}