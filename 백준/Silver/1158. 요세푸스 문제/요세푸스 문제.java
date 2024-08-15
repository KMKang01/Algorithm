import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder().append("<");

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            queue.addLast(i + 1);
        }


        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.addLast(queue.removeFirst());
            }
            sb.append(queue.removeFirst()+", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}

