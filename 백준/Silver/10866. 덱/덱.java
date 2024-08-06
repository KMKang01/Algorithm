import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        String line;
        String command;

        for (int i = 0; i < N; i++) {
            line = br.readLine();
            command = line.split(" ")[0];
            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(line.split(" ")[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(line.split(" ")[1]));
                    break;
                case "pop_front":
                    if (!deque.isEmpty()) sb.append(deque.removeFirst()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "pop_back":
                    if (!deque.isEmpty()) sb.append(deque.removeLast()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if (!deque.isEmpty()) sb.append(deque.getFirst()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "back":
                    if (!deque.isEmpty()) sb.append(deque.getLast()).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        System.out.println(sb.toString().trim());
    }
}