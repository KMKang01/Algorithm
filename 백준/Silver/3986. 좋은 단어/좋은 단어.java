import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<String> stack = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String[] charArr = br.readLine().split("");
            for (String s : charArr) {
                if (!stack.isEmpty() && stack.peek().equals(s)) {
                    stack.pop();
                } else {
                    stack.push(s);
                }
            }
            if (stack.isEmpty()) count++;
            stack.clear();
        }
        System.out.println(count);
    }
}