import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "1":
                    stack.addFirst(cmd[1]);
                    break;
                case "2":
                    stack.addLast(cmd[1]);
                    break;
                case "3":
                    if (!stack.isEmpty()) sb.append(stack.removeFirst()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "4":
                    if (!stack.isEmpty()) sb.append(stack.removeLast()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "5":
                    sb.append(stack.size()).append("\n");
                    break;
                case "6":
                    if (stack.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "7":
                    if (!stack.isEmpty()) sb.append(stack.peekFirst()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "8":
                    if (!stack.isEmpty()) sb.append(stack.getLast()).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        System.out.println(sb.toString().trim());
    }
}