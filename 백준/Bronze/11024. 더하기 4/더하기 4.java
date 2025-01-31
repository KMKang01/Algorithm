import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String [] line = br.readLine().split(" ");
            int sum = 0;
            for(String a: line){
                sum += Integer.parseInt(a);
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}

