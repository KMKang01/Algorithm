import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> numMap = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();

        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int M = Integer.parseInt(line.split(" ")[1]);

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            numMap.put(i + 1, name);
            nameMap.put(name, i + 1);
        }

        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            try {
                int num = Integer.parseInt(question);
                sb.append(numMap.get(num)).append("\n");
            } catch (NumberFormatException e) {
                sb.append(nameMap.get(question)).append("\n");
            }
        }

        System.out.println(sb.toString().trim());

    }
}