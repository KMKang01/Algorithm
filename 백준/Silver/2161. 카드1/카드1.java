import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N ; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            int tmp = queue.poll();
            if(queue.isEmpty()){
                sb.append(tmp);
                break;
            } else {
                sb.append(tmp + " ");
                queue.add(queue.poll());
            }
        }
        System.out.println(sb);
    }
}