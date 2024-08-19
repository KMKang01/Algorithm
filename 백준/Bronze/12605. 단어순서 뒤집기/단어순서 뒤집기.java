import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stack = new ArrayDeque<>();
            String line = br.readLine();
            for(String a: line.split(" ")){stack.push(a);}
            sb.append("Case #").append(i + 1).append(": ");
            for (String str : stack) {
                sb.append(str).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}