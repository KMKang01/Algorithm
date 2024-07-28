import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String line;

        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        HashMap<String, String> dict = new HashMap<>();

        for (int i = 0; i < N; i++) {
            line = br.readLine();
            dict.put(line.split(" ")[0], line.split(" ")[1]);
        }

        for (int i = 0; i < M; i++) {
            line = br.readLine();
            sb.append(dict.get(line)).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}