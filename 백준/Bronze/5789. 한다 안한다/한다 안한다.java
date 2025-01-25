import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T ; i++) {
            String [] in = br.readLine().split("");

            if(in[in.length/2].equals(in[(in.length/2)- 1])) sb.append("Do-it\n");
            else sb.append("Do-it-Not\n");


        }
        System.out.println(sb);
    }
}