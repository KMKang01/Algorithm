import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n0 = Integer.parseInt(br.readLine());
        int i = 1;

        while (n0 != 0) {

            int n1 = 3 * n0;
            int n2;
            int n3;
            boolean isOdd = true;
            if (n1 % 2 == 0) {
                n2 = n1 / 2;
                isOdd = false;
            } else {
                n2 = (n1 + 1) / 2;
            }
            n3 = 3 * n2;

            int n4 = n3 / 9;

            if(isOdd){
                sb.append(i).append(". ").append("odd ").append(n4).append("\n");
            } else {
                sb.append(i).append(". ").append("even ").append(n4).append("\n");
            }

            n0 = Integer.parseInt(br.readLine());
            i++;
        }
        System.out.println(sb.toString().trim());
    }
}