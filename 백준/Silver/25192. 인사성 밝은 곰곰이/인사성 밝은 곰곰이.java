import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;


        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if(line.equals("ENTER")) {
                set = new HashSet<>();
            } else {
                if(!set.contains(line)) {
                    set.add(line);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}