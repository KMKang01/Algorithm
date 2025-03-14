import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        while (true) {
            String line = br.readLine();
            if (line == null) break; // EOF 체크
            count++;
        }
        
        System.out.println(count);
    }
}
