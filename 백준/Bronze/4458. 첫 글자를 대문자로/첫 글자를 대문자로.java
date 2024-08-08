import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String firstLetter = line.substring(0, 1);
            String remainder = line.substring(1);
            sb.append((firstLetter.toUpperCase()) + remainder + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}